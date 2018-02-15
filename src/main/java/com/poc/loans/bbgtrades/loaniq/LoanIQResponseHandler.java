package com.poc.loans.bbgtrades.loaniq;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.loans.bbgtrades.repo.bbg.ApiResponse;
import com.poc.loans.bbgtrades.repo.bbg.ApiResponseRepo;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTradeRepo;
import com.poc.loans.bbgtrades.xml.response.XmlResponse;

@Component
public class LoanIQResponseHandler {

	@Autowired
	private ApiResponseRepo responseRepo;
	
	@Autowired
	private BBGStagedTradeRepo stagedTradeRepo;

	public XmlResponse handleResponse(BBGStagedTrade trade,  XmlResponse xmlResponse, String xmlRequest) {
		ApiResponse response = new ApiResponse();
		String result = marshal(xmlResponse);
		response.setMessages(xmlResponse.getMessages().getMessage());
		
		/*if (null != xmlResponse.getResult() && null != xmlResponse.getResult().getCircleAsReturnValue()) {
			result = "id=" + xmlResponse.getResult().getCircleAsReturnValue().getInternalId() + " status="
					+ xmlResponse.getResult().getCircleAsReturnValue().getStatus();
		}
		*/
		//response.setTradeId(Long.parseLong(tradeId.toString()));
		
		
		response.setTradeId(new Long(trade.getBbgtradeid()));
		response.setResult(result);
		response.setSuccess(Boolean.toString(xmlResponse.isSuccess()));
		response.setXmlCall(xmlRequest);
		response.setTicketNumber(Integer.toString(trade.getTicketNumber()));
				
		if(null != xmlResponse.getResult() && null != xmlResponse.getResult().getCircleAsReturnValue() && xmlResponse.isSuccess()) {
				trade.setStatus("SUCCESS");
				trade.setInvTradeRid(xmlResponse.getResult().getCircleAsReturnValue().getInternalId());
			} else if (!xmlResponse.isSuccess() && StringUtils.contains(xmlRequest, "<!DOCTYPE CreateTrade")){
				trade.setStatus("FAIL");
			}
		
		responseRepo.save(response);
		stagedTradeRepo.save(trade);
		
		return xmlResponse;
	}

	private String marshal(XmlResponse xmlResponse) {
		String responseString = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(XmlResponse.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(xmlResponse, sw);
			responseString = sw.toString();
			return responseString;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	
/*	public XmlResponse handleResponse(XmlResponse xmlResponse, Integer tradeId, String xmlString) {
		ApiResponse response = new ApiResponse();
		String result = null;
		response.setMessages(xmlResponse.getMessages().getMessage());
		if (null != xmlResponse.getResult() && null != xmlResponse.getResult().getCircleAsReturnValue()) {
			result = "id=" + xmlResponse.getResult().getCircleAsReturnValue().getInternalId() + " status="
					+ xmlResponse.getResult().getCircleAsReturnValue().getStatus();
		}
		response.setTradeId(Long.parseLong(tradeId.toString()));
		response.setResult(result);
		response.setSuccess(Boolean.toString(xmlResponse.isSuccess()));
		response.setXmlCall(xmlString);
				
		responseRepo.save(response);
		
		return xmlResponse;
	}

	public XmlResponse handleDealResponse(XmlResponse xmlResponse, Integer tradeId, String xmlString) {
		ApiResponse response = new ApiResponse();
		String result = null;
		response.setMessages(xmlResponse.getMessages().getMessage());
		if (null != xmlResponse.getResult() && null != xmlResponse.getResult().getDealAsReturnValue()) {
			result = "Deal Name= "+ xmlResponse.getResult().getDealAsReturnValue().getDealName() + " id= " + xmlResponse.getResult().getDealAsReturnValue().getDealId() + " status= "
					+ xmlResponse.getResult().getDealAsReturnValue().getStatus();
		}
		response.setTradeId(Long.parseLong(tradeId.toString()));
		response.setResult(result);
		response.setSuccess(Boolean.toString(xmlResponse.isSuccess()));
		response.setXmlCall(xmlString);
		
		responseRepo.save(response);
		
		return xmlResponse;
	}
	
	public XmlResponse handleFacilityResponse(XmlResponse xmlResponse, Integer tradeId, String xmlString) {
		ApiResponse response = new ApiResponse();
		String result = null;
		response.setMessages(xmlResponse.getMessages().getMessage());
		if (null != xmlResponse.getResult() && null != xmlResponse.getResult().getCircleAsReturnValue()) {
			result = xmlResponse.getResult().toString();
		}
		response.setTradeId(Long.parseLong(tradeId.toString()));
		response.setResult(result);
		response.setSuccess(Boolean.toString(xmlResponse.isSuccess()));
		response.setXmlCall(xmlString);
		
		responseRepo.save(response);
		
		return xmlResponse;
	}*/

}
