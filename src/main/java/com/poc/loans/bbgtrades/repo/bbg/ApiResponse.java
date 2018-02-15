package com.poc.loans.bbgtrades.repo.bbg;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "API_RESPONSE")
public class ApiResponse {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "API_RESPONSE")
	private String success;

	@Column(name = "RESULT")
	private String result;

	@Column(name = "TRADE_ID")
	private Long tradeId;

	@Column(name = "XML_CALL_STRING")
	private String xmlCall;
	
	@CreationTimestamp
	@Column(name = "TimeStamp")
	private Timestamp timestamp;

	@Column(name = "TICKET_NUMBER")
	private String ticketNumber;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> messages;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the ticketNumber
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}

	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the success
	 */
	public String getSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(String success) {
		this.success = success;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @return the tradeId
	 */
	public Long getTradeId() {
		return tradeId;
	}

	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * @return the messages
	 */
	
	public String getXmlCall() {
		return xmlCall;
	}

	public void setXmlCall(String xml_call) {
		this.xmlCall = xml_call;
	}
	
	public List<String> getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		result = prime * result + ((success == null) ? 0 : success.hashCode());
		result = prime * result + ((ticketNumber == null) ? 0 : ticketNumber.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
		result = prime * result + ((xmlCall == null) ? 0 : xmlCall.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApiResponse other = (ApiResponse) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (messages == null) {
			if (other.messages != null)
				return false;
		} else if (!messages.equals(other.messages))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		if (success == null) {
			if (other.success != null)
				return false;
		} else if (!success.equals(other.success))
			return false;
		if (ticketNumber == null) {
			if (other.ticketNumber != null)
				return false;
		} else if (!ticketNumber.equals(other.ticketNumber))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (tradeId == null) {
			if (other.tradeId != null)
				return false;
		} else if (!tradeId.equals(other.tradeId))
			return false;
		if (xmlCall == null) {
			if (other.xmlCall != null)
				return false;
		} else if (!xmlCall.equals(other.xmlCall))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApiResponse [id=" + id + ", success=" + success + ", result=" + result + ", tradeId=" + tradeId
				+ ", xmlCall=" + xmlCall + ", timestamp=" + timestamp + ", ticketNumber=" + ticketNumber + ", messages="
				+ messages + "]";
	}


}
