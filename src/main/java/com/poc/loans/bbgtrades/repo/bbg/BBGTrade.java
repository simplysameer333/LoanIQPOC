package com.poc.loans.bbgtrades.repo.bbg;

import com.poc.loans.bbgtrades.repo.loaniq.VlsCustLocation;
import com.poc.loans.bbgtrades.repo.loaniq.VlsCustomer;
import com.poc.loans.bbgtrades.repo.loaniq.VlsDeal;
import com.poc.loans.bbgtrades.repo.loaniq.VlsFacility;

public class BBGTrade {

	private RawBBGTrade rawBBGTrade;
	private VlsCustomer customer;
	private VlsFacility facility;
	private BBGLoaniqBookMap bookMap;
	private VlsCustLocation location;
	private VlsDeal deal;
	private RawBBGSecurityStatic security;
	
	public RawBBGTrade getRawBBGTrade() {
		return rawBBGTrade;
	}
	public void setRawBBGTrade(RawBBGTrade rawBBGTrade) {
		this.rawBBGTrade = rawBBGTrade;
	}
	public VlsCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(VlsCustomer customer) {
		this.customer = customer;
	}
	public VlsFacility getFacility() {
		return facility;
	}
	public void setFacility(VlsFacility facility) {
		this.facility = facility;
	}
	public BBGLoaniqBookMap getBookMap() {
		return bookMap;
	}
	public void setBookMap(BBGLoaniqBookMap bookMap) {
		this.bookMap = bookMap;
	}
	public VlsCustLocation getLocation() {
		return location;
	}
	public void setLocation(VlsCustLocation location) {
		this.location = location;
	}
	public VlsDeal getDeal() {
		return deal;
	}
	public void setDeal(VlsDeal deal) {
		this.deal = deal;
	}
	public RawBBGSecurityStatic getSecurity() {
		return security;
	}
	public void setSecurity(RawBBGSecurityStatic security) {
		this.security = security;
	}
	
}
