package com.poc.loans.bbgtrades.loaniq;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLDecoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.xml.response.XmlResponse;

@Component
public class ApiCall {

	private static final Log LOG = LogFactory.getLog(ApiCall.class);

	@Value("${loaniq.hostname}")
	private String hostname;

	@Value("${loaniq.port}")
	private int port;

	@Autowired
	private LoanIQResponseHandler responseHandler;

	public XmlResponse call(BBGStagedTrade trade, String xmlString) throws IOException { //, Integer tradeId, String newDeal) {

		XmlResponse response = new XmlResponse();

		String xmlResponseString = null;
		xmlString = wrapInXqueryXMLApirequest(xmlString);
		LOG.info("REQUEST : " + xmlString);

		xmlResponseString = xmlApiTransaction(xmlString);

		XmlResponse xmlResponse = unmarshal(xmlResponseString);

		/*
			if (Constants.TRADE.equals(newDeal))
				response = responseHandler.handleResponse(xmlResponse, tradeId, xmlString);
			else if (Constants.DEAL.equals(newDeal))
				response = responseHandler.handleDealResponse(xmlResponse, tradeId, xmlString);
			else if (Constants.FACILITY.equals(newDeal))
				response = responseHandler.handleFacilityResponse(xmlResponse, tradeId, xmlString);
		 */

		response = responseHandler.handleResponse(trade, xmlResponse, xmlString);

		LOG.info("RESPONSE : " + xmlResponseString);
		return response;
	}

	private static String readUptoNull(InputStream in) throws IOException {
		StringBuffer buffer = new StringBuffer();
		char ch;
		while ('\0' != (ch = (char) (in.read()))) {
			buffer.append(ch);
		}
		return buffer.toString();
	}

	private static String wrapInXqueryXMLApirequest(String xqString) {
		xqString = StringUtils.replaceOnce(xqString, "yes", "no");
		return xqString;
	}

	@SuppressWarnings("unused")
	private static String unwrapXQueryResultFromXMLAPIResponse(String xmlResponse)
			throws XPathExpressionException, UnsupportedEncodingException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		ByteArrayInputStream baStream = new ByteArrayInputStream(xmlResponse.getBytes());
		InputSource inputSource = new InputSource(baStream);
		dbf.setValidating(false);

		XPathFactory xpf = XPathFactory.newInstance();
		XPath xp = xpf.newXPath();
		NodeList nodes = (NodeList) (xp.evaluate("//RunXQueryResults/@queryResult", inputSource,
				XPathConstants.NODESET));
		return URLDecoder.decode(nodes.item(0).getTextContent(), "UTF-8");
	}

	private String xmlApiTransaction(String xmlString) throws IOException {

		InputStream in = null;
		Socket cSocket = null;

		try {

			cSocket = new Socket(hostname, port);
			PrintStream out = new PrintStream(cSocket.getOutputStream());
			out.write(xmlString.getBytes());
			out.write('\0');
			in = cSocket.getInputStream();
			readUptoNull(in);
			String xmlResponse = readUptoNull(in);
			return xmlResponse;

		} catch (Exception e) {
			// rethrow exception because we need to clean up resources in finally
			LOG.error("failed to open connection to LIQ API server: " + e.getMessage());
			//throw e;

		} finally {

			if (in != null) in.close();
			if (cSocket != null) cSocket.close();
		}
		return null;
	}

	public static XmlResponse unmarshal(String response) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(XmlResponse.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader stringReader = new StringReader(response);
			return (XmlResponse) jaxbUnmarshaller.unmarshal(stringReader);
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}

}
