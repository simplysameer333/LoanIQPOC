package com.poc.loans.bbgtrades.repo.bbg;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RAWBBGSECURITYSTATIC")
public class RawBBGSecurityStatic implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SECURITY_ID")
	private Integer securityId;

	@Column(name = "BBG_SECURITY_ID")
	private String bbgSecurityId;

	@Column(name = "LN_DEAL_ID")
	private String lnDealId;

	@Column(name = "LN_DEAL_AMT")
	private Double lnDealAmt;

	@Column(name = "DEAL_NAME")
	private String dealName;

	@Column(name = "ID_FIRM_ID")
	private String idFirmId;

	@Column(name = "ID_BB")
	private String idBb;

	@Column(name = "ID_ISIN")
	private String idIsin;

	@Column(name = "ID_CUSIP")
	private String idCusip;

	@Column(name = "ID_BB_UNIQUE")
	private String idBbUnique;

	@Column(name = "SECURITY_NAME")
	private String securityName;

	@Column(name = "SECURITY_SHORT_DES")
	private String securityShortDes;

	@Column(name = "ISSUER")
	private String issuer;

	@Column(name = "ISSUER_BULK")
	private String issuerBulk;

	@Column(name = "SHORT_NAME")
	private String shortName;

	@Column(name = "ISSUER_INDUSTRY")
	private String issuerIndustry;

	@Column(name = "ID_BB_ULTIMATE_PARENT_CO_NAME")
	private String idBbUltimateParentCoName;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "AMT_OUTSTANDING")
	private Double amtOutstanding;

	@Column(name = "AMT_ISSUED")
	private Double amtIssued;

	@Column(name = "MUNI_TAX_DES")
	private String muniTaxDes;

	@Column(name = "ISSUE_PX")
	private Integer issuePx;

	@Column(name = "CALC_TYP")
	private String calcTyp;

	@Column(name = "DAY_CNT_DES")
	private String dayCntDes;

	@Column(name = "SECURITY_TYP")
	private String securityTyp;

	@Column(name = "SECURITY_TYP2")
	private String securityTyp2;

	@Column(name = "MATURITY")
	private Timestamp maturity;

	@Column(name = "CPN")
	private Integer cpn;

	@Column(name = "CPN_TYP")
	private String cpnTyp;

	@Column(name = "CPN_FREQ")
	private Integer cpnFreq;

	@Column(name = "ISSUE_DT")
	private Timestamp issueDt;

	@Column(name = "FIRST_CPN_DT")
	private Timestamp firstCpnDt;

	@Column(name = "NXT_CPN_DT")
	private Timestamp nxtCpnDt;

	@Column(name = "PREV_CPN_DT")
	private Timestamp prevCpnDt;

	@Column(name = "CREATE_DATE")
	private Timestamp createDate;

	@Column(name = "USER_CREATE")
	private String userCreate;

	@Column(name = "UPDATE_DATE")
	private Timestamp updateDate;
	
	@Column(name = "USER_UPDATE")
	private String userUpdate;


	
	/**
	 * @return the security_id
	 */
	public Integer getSecurity_id() {
		return securityId;
	}

	/**
	 * @param security_id the security_id to set
	 */
	public void setSecurity_id(Integer security_id) {
		this.securityId = security_id;
	}

	/**
	 * @return the bbg_security_id
	 */
	public String getBbg_security_id() {
		return bbgSecurityId;
	}

	/**
	 * @param bbg_security_id the bbg_security_id to set
	 */
	public void setBbg_security_id(String bbg_security_id) {
		this.bbgSecurityId = bbg_security_id;
	}

	/**
	 * @return the ln_deal_id
	 */
	public String getLn_deal_id() {
		return lnDealId;
	}

	/**
	 * @param ln_deal_id the ln_deal_id to set
	 */
	public void setLn_deal_id(String ln_deal_id) {
		this.lnDealId = ln_deal_id;
	}

	/**
	 * @return the ln_deal_amt
	 */
	public Double getLn_deal_amt() {
		return lnDealAmt;
	}

	/**
	 * @param ln_deal_amt the ln_deal_amt to set
	 */
	public void setLn_deal_amt(Double ln_deal_amt) {
		this.lnDealAmt = ln_deal_amt;
	}

	/**
	 * @return the deal_name
	 */
	public String getDeal_name() {
		return dealName;
	}

	/**
	 * @param deal_name the deal_name to set
	 */
	public void setDeal_name(String deal_name) {
		this.dealName = deal_name;
	}

	/**
	 * @return the id_firm_id
	 */
	public String getId_firm_id() {
		return idFirmId;
	}

	/**
	 * @param id_firm_id the id_firm_id to set
	 */
	public void setId_firm_id(String id_firm_id) {
		this.idFirmId = id_firm_id;
	}

	/**
	 * @return the id_bb
	 */
	public String getId_bb() {
		return idBb;
	}

	/**
	 * @param id_bb the id_bb to set
	 */
	public void setId_bb(String id_bb) {
		this.idBb = id_bb;
	}

	/**
	 * @return the id_isin
	 */
	public String getId_isin() {
		return idIsin;
	}

	/**
	 * @param id_isin the id_isin to set
	 */
	public void setId_isin(String id_isin) {
		this.idIsin = id_isin;
	}

	/**
	 * @return the id_cusip
	 */
	public String getId_cusip() {
		return idCusip;
	}

	/**
	 * @param id_cusip the id_cusip to set
	 */
	public void setId_cusip(String id_cusip) {
		this.idCusip = id_cusip;
	}

	/**
	 * @return the id_bb_unique
	 */
	public String getId_bb_unique() {
		return idBbUnique;
	}

	/**
	 * @param id_bb_unique the id_bb_unique to set
	 */
	public void setId_bb_unique(String id_bb_unique) {
		this.idBbUnique = id_bb_unique;
	}

	/**
	 * @return the security_name
	 */
	public String getSecurity_name() {
		return securityName;
	}

	/**
	 * @param security_name the security_name to set
	 */
	public void setSecurity_name(String security_name) {
		this.securityName = security_name;
	}

	/**
	 * @return the security_short_des
	 */
	public String getSecurity_short_des() {
		return securityShortDes;
	}

	/**
	 * @param security_short_des the security_short_des to set
	 */
	public void setSecurity_short_des(String security_short_des) {
		this.securityShortDes = security_short_des;
	}

	/**
	 * @return the issuer
	 */
	public String getIssuer() {
		return issuer;
	}

	/**
	 * @param issuer the issuer to set
	 */
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * @return the issuer_bulk
	 */
	public String getIssuer_bulk() {
		return issuerBulk;
	}

	/**
	 * @param issuer_bulk the issuer_bulk to set
	 */
	public void setIssuer_bulk(String issuer_bulk) {
		this.issuerBulk = issuer_bulk;
	}

	/**
	 * @return the short_name
	 */
	public String getShort_name() {
		return shortName;
	}

	/**
	 * @param short_name the short_name to set
	 */
	public void setShort_name(String short_name) {
		this.shortName = short_name;
	}

	/**
	 * @return the issuer_industry
	 */
	public String getIssuer_industry() {
		return issuerIndustry;
	}

	/**
	 * @param issuer_industry the issuer_industry to set
	 */
	public void setIssuer_industry(String issuer_industry) {
		this.issuerIndustry = issuer_industry;
	}

	/**
	 * @return the id_bb_ultimate_parent_co_name
	 */
	public String getId_bb_ultimate_parent_co_name() {
		return idBbUltimateParentCoName;
	}

	/**
	 * @param id_bb_ultimate_parent_co_name the id_bb_ultimate_parent_co_name to set
	 */
	public void setId_bb_ultimate_parent_co_name(String id_bb_ultimate_parent_co_name) {
		this.idBbUltimateParentCoName = id_bb_ultimate_parent_co_name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the amt_outstanding
	 */
	public Double getAmt_outstanding() {
		return amtOutstanding;
	}

	/**
	 * @param amt_outstanding the amt_outstanding to set
	 */
	public void setAmt_outstanding(Double amt_outstanding) {
		this.amtOutstanding = amt_outstanding;
	}

	/**
	 * @return the amt_issued
	 */
	public Double getAmt_issued() {
		return amtIssued;
	}

	/**
	 * @param amt_issued the amt_issued to set
	 */
	public void setAmt_issued(Double amt_issued) {
		this.amtIssued = amt_issued;
	}

	/**
	 * @return the muni_tax_des
	 */
	public String getMuni_tax_des() {
		return muniTaxDes;
	}

	/**
	 * @param muni_tax_des the muni_tax_des to set
	 */
	public void setMuni_tax_des(String muni_tax_des) {
		this.muniTaxDes = muni_tax_des;
	}

	/**
	 * @return the issue_px
	 */
	public Integer getIssue_px() {
		return issuePx;
	}

	/**
	 * @param issue_px the issue_px to set
	 */
	public void setIssue_px(Integer issue_px) {
		this.issuePx = issue_px;
	}

	/**
	 * @return the calc_typ
	 */
	public String getCalc_typ() {
		return calcTyp;
	}

	/**
	 * @param calc_typ the calc_typ to set
	 */
	public void setCalc_typ(String calc_typ) {
		this.calcTyp = calc_typ;
	}

	/**
	 * @return the day_cnt_des
	 */
	public String getDay_cnt_des() {
		return dayCntDes;
	}

	/**
	 * @param day_cnt_des the day_cnt_des to set
	 */
	public void setDay_cnt_des(String day_cnt_des) {
		this.dayCntDes = day_cnt_des;
	}

	/**
	 * @return the security_typ
	 */
	public String getSecurity_typ() {
		return securityTyp;
	}

	/**
	 * @param security_typ the security_typ to set
	 */
	public void setSecurity_typ(String security_typ) {
		this.securityTyp = security_typ;
	}

	/**
	 * @return the security_typ2
	 */
	public String getSecurity_typ2() {
		return securityTyp2;
	}

	/**
	 * @param security_typ2 the security_typ2 to set
	 */
	public void setSecurity_typ2(String security_typ2) {
		this.securityTyp2 = security_typ2;
	}

	/**
	 * @return the maturity
	 */
	public Timestamp getMaturity() {
		return maturity;
	}

	/**
	 * @param maturity the maturity to set
	 */
	public void setMaturity(Timestamp maturity) {
		this.maturity = maturity;
	}

	/**
	 * @return the cpn
	 */
	public Integer getCpn() {
		return cpn;
	}

	/**
	 * @param cpn the cpn to set
	 */
	public void setCpn(Integer cpn) {
		this.cpn = cpn;
	}

	/**
	 * @return the cpn_typ
	 */
	public String getCpn_typ() {
		return cpnTyp;
	}

	/**
	 * @param cpn_typ the cpn_typ to set
	 */
	public void setCpn_typ(String cpn_typ) {
		this.cpnTyp = cpn_typ;
	}

	/**
	 * @return the cpn_freq
	 */
	public Integer getCpn_freq() {
		return cpnFreq;
	}

	/**
	 * @param cpn_freq the cpn_freq to set
	 */
	public void setCpn_freq(Integer cpn_freq) {
		this.cpnFreq = cpn_freq;
	}

	/**
	 * @return the issue_dt
	 */
	public Timestamp getIssue_dt() {
		return issueDt;
	}

	/**
	 * @param issue_dt the issue_dt to set
	 */
	public void setIssue_dt(Timestamp issue_dt) {
		this.issueDt = issue_dt;
	}

	/**
	 * @return the first_cpn_dt
	 */
	public Timestamp getFirst_cpn_dt() {
		return firstCpnDt;
	}

	/**
	 * @param first_cpn_dt the first_cpn_dt to set
	 */
	public void setFirst_cpn_dt(Timestamp first_cpn_dt) {
		this.firstCpnDt = first_cpn_dt;
	}

	/**
	 * @return the nxt_cpn_dt
	 */
	public Timestamp getNxt_cpn_dt() {
		return nxtCpnDt;
	}

	/**
	 * @param nxt_cpn_dt the nxt_cpn_dt to set
	 */
	public void setNxt_cpn_dt(Timestamp nxt_cpn_dt) {
		this.nxtCpnDt = nxt_cpn_dt;
	}

	/**
	 * @return the prev_cpn_dt
	 */
	public Timestamp getPrev_cpn_dt() {
		return prevCpnDt;
	}

	/**
	 * @param prev_cpn_dt the prev_cpn_dt to set
	 */
	public void setPrev_cpn_dt(Timestamp prev_cpn_dt) {
		this.prevCpnDt = prev_cpn_dt;
	}

	/**
	 * @return the create_date
	 */
	public Timestamp getCreate_date() {
		return createDate;
	}

	/**
	 * @param create_date the create_date to set
	 */
	public void setCreate_date(Timestamp create_date) {
		this.createDate = create_date;
	}

	/**
	 * @return the user_create
	 */
	public String getUser_create() {
		return userCreate;
	}

	/**
	 * @param user_create the user_create to set
	 */
	public void setUser_create(String user_create) {
		this.userCreate = user_create;
	}

	/**
	 * @return the update_date
	 */
	public Timestamp getUpdate_date() {
		return updateDate;
	}

	/**
	 * @param update_date the update_date to set
	 */
	public void setUpdate_date(Timestamp update_date) {
		this.updateDate = update_date;
	}

	/**
	 * @return the user_update
	 */
	public String getUser_update() {
		return userUpdate;
	}

	/**
	 * @param user_update the user_update to set
	 */
	public void setUser_update(String user_update) {
		this.userUpdate = user_update;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amtIssued == null) ? 0 : amtIssued.hashCode());
		result = prime * result + ((amtOutstanding == null) ? 0 : amtOutstanding.hashCode());
		result = prime * result + ((bbgSecurityId == null) ? 0 : bbgSecurityId.hashCode());
		result = prime * result + ((calcTyp == null) ? 0 : calcTyp.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((cpn == null) ? 0 : cpn.hashCode());
		result = prime * result + ((cpnFreq == null) ? 0 : cpnFreq.hashCode());
		result = prime * result + ((cpnTyp == null) ? 0 : cpnTyp.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((dayCntDes == null) ? 0 : dayCntDes.hashCode());
		result = prime * result + ((dealName == null) ? 0 : dealName.hashCode());
		result = prime * result + ((firstCpnDt == null) ? 0 : firstCpnDt.hashCode());
		result = prime * result + ((idBb == null) ? 0 : idBb.hashCode());
		result = prime * result
				+ ((idBbUltimateParentCoName == null) ? 0 : idBbUltimateParentCoName.hashCode());
		result = prime * result + ((idBbUnique == null) ? 0 : idBbUnique.hashCode());
		result = prime * result + ((idCusip == null) ? 0 : idCusip.hashCode());
		result = prime * result + ((idFirmId == null) ? 0 : idFirmId.hashCode());
		result = prime * result + ((idIsin == null) ? 0 : idIsin.hashCode());
		result = prime * result + ((issueDt == null) ? 0 : issueDt.hashCode());
		result = prime * result + ((issuePx == null) ? 0 : issuePx.hashCode());
		result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
		result = prime * result + ((issuerBulk == null) ? 0 : issuerBulk.hashCode());
		result = prime * result + ((issuerIndustry == null) ? 0 : issuerIndustry.hashCode());
		result = prime * result + ((lnDealAmt == null) ? 0 : lnDealAmt.hashCode());
		result = prime * result + ((lnDealId == null) ? 0 : lnDealId.hashCode());
		result = prime * result + ((maturity == null) ? 0 : maturity.hashCode());
		result = prime * result + ((muniTaxDes == null) ? 0 : muniTaxDes.hashCode());
		result = prime * result + ((nxtCpnDt == null) ? 0 : nxtCpnDt.hashCode());
		result = prime * result + ((prevCpnDt == null) ? 0 : prevCpnDt.hashCode());
		result = prime * result + ((securityId == null) ? 0 : securityId.hashCode());
		result = prime * result + ((securityName == null) ? 0 : securityName.hashCode());
		result = prime * result + ((securityShortDes == null) ? 0 : securityShortDes.hashCode());
		result = prime * result + ((securityTyp == null) ? 0 : securityTyp.hashCode());
		result = prime * result + ((securityTyp2 == null) ? 0 : securityTyp2.hashCode());
		result = prime * result + ((shortName == null) ? 0 : shortName.hashCode());
		result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
		result = prime * result + ((userCreate == null) ? 0 : userCreate.hashCode());
		result = prime * result + ((userUpdate == null) ? 0 : userUpdate.hashCode());
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
		RawBBGSecurityStatic other = (RawBBGSecurityStatic) obj;
		if (amtIssued == null) {
			if (other.amtIssued != null)
				return false;
		} else if (!amtIssued.equals(other.amtIssued))
			return false;
		if (amtOutstanding == null) {
			if (other.amtOutstanding != null)
				return false;
		} else if (!amtOutstanding.equals(other.amtOutstanding))
			return false;
		if (bbgSecurityId == null) {
			if (other.bbgSecurityId != null)
				return false;
		} else if (!bbgSecurityId.equals(other.bbgSecurityId))
			return false;
		if (calcTyp == null) {
			if (other.calcTyp != null)
				return false;
		} else if (!calcTyp.equals(other.calcTyp))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (cpn == null) {
			if (other.cpn != null)
				return false;
		} else if (!cpn.equals(other.cpn))
			return false;
		if (cpnFreq == null) {
			if (other.cpnFreq != null)
				return false;
		} else if (!cpnFreq.equals(other.cpnFreq))
			return false;
		if (cpnTyp == null) {
			if (other.cpnTyp != null)
				return false;
		} else if (!cpnTyp.equals(other.cpnTyp))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (dayCntDes == null) {
			if (other.dayCntDes != null)
				return false;
		} else if (!dayCntDes.equals(other.dayCntDes))
			return false;
		if (dealName == null) {
			if (other.dealName != null)
				return false;
		} else if (!dealName.equals(other.dealName))
			return false;
		if (firstCpnDt == null) {
			if (other.firstCpnDt != null)
				return false;
		} else if (!firstCpnDt.equals(other.firstCpnDt))
			return false;
		if (idBb == null) {
			if (other.idBb != null)
				return false;
		} else if (!idBb.equals(other.idBb))
			return false;
		if (idBbUltimateParentCoName == null) {
			if (other.idBbUltimateParentCoName != null)
				return false;
		} else if (!idBbUltimateParentCoName.equals(other.idBbUltimateParentCoName))
			return false;
		if (idBbUnique == null) {
			if (other.idBbUnique != null)
				return false;
		} else if (!idBbUnique.equals(other.idBbUnique))
			return false;
		if (idCusip == null) {
			if (other.idCusip != null)
				return false;
		} else if (!idCusip.equals(other.idCusip))
			return false;
		if (idFirmId == null) {
			if (other.idFirmId != null)
				return false;
		} else if (!idFirmId.equals(other.idFirmId))
			return false;
		if (idIsin == null) {
			if (other.idIsin != null)
				return false;
		} else if (!idIsin.equals(other.idIsin))
			return false;
		if (issueDt == null) {
			if (other.issueDt != null)
				return false;
		} else if (!issueDt.equals(other.issueDt))
			return false;
		if (issuePx == null) {
			if (other.issuePx != null)
				return false;
		} else if (!issuePx.equals(other.issuePx))
			return false;
		if (issuer == null) {
			if (other.issuer != null)
				return false;
		} else if (!issuer.equals(other.issuer))
			return false;
		if (issuerBulk == null) {
			if (other.issuerBulk != null)
				return false;
		} else if (!issuerBulk.equals(other.issuerBulk))
			return false;
		if (issuerIndustry == null) {
			if (other.issuerIndustry != null)
				return false;
		} else if (!issuerIndustry.equals(other.issuerIndustry))
			return false;
		if (lnDealAmt == null) {
			if (other.lnDealAmt != null)
				return false;
		} else if (!lnDealAmt.equals(other.lnDealAmt))
			return false;
		if (lnDealId == null) {
			if (other.lnDealId != null)
				return false;
		} else if (!lnDealId.equals(other.lnDealId))
			return false;
		if (maturity == null) {
			if (other.maturity != null)
				return false;
		} else if (!maturity.equals(other.maturity))
			return false;
		if (muniTaxDes == null) {
			if (other.muniTaxDes != null)
				return false;
		} else if (!muniTaxDes.equals(other.muniTaxDes))
			return false;
		if (nxtCpnDt == null) {
			if (other.nxtCpnDt != null)
				return false;
		} else if (!nxtCpnDt.equals(other.nxtCpnDt))
			return false;
		if (prevCpnDt == null) {
			if (other.prevCpnDt != null)
				return false;
		} else if (!prevCpnDt.equals(other.prevCpnDt))
			return false;
		if (securityId == null) {
			if (other.securityId != null)
				return false;
		} else if (!securityId.equals(other.securityId))
			return false;
		if (securityName == null) {
			if (other.securityName != null)
				return false;
		} else if (!securityName.equals(other.securityName))
			return false;
		if (securityShortDes == null) {
			if (other.securityShortDes != null)
				return false;
		} else if (!securityShortDes.equals(other.securityShortDes))
			return false;
		if (securityTyp == null) {
			if (other.securityTyp != null)
				return false;
		} else if (!securityTyp.equals(other.securityTyp))
			return false;
		if (securityTyp2 == null) {
			if (other.securityTyp2 != null)
				return false;
		} else if (!securityTyp2.equals(other.securityTyp2))
			return false;
		if (shortName == null) {
			if (other.shortName != null)
				return false;
		} else if (!shortName.equals(other.shortName))
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
			return false;
		if (userCreate == null) {
			if (other.userCreate != null)
				return false;
		} else if (!userCreate.equals(other.userCreate))
			return false;
		if (userUpdate == null) {
			if (other.userUpdate != null)
				return false;
		} else if (!userUpdate.equals(other.userUpdate))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RawBBGSecurityStatic [security_id=" + securityId + ", bbg_security_id=" + bbgSecurityId
				+ ", ln_deal_id=" + lnDealId + ", ln_deal_amt=" + lnDealAmt + ", deal_name=" + dealName
				+ ", id_firm_id=" + idFirmId + ", id_bb=" + idBb + ", id_isin=" + idIsin + ", id_cusip=" + idCusip
				+ ", id_bb_unique=" + idBbUnique + ", security_name=" + securityName + ", security_short_des="
				+ securityShortDes + ", issuer=" + issuer + ", issuer_bulk=" + issuerBulk + ", short_name="
				+ shortName + ", issuer_industry=" + issuerIndustry + ", id_bb_ultimate_parent_co_name="
				+ idBbUltimateParentCoName + ", country=" + country + ", amt_outstanding=" + amtOutstanding
				+ ", amt_issued=" + amtIssued + ", muni_tax_des=" + muniTaxDes + ", issue_px=" + issuePx
				+ ", calc_typ=" + calcTyp + ", day_cnt_des=" + dayCntDes + ", security_typ=" + securityTyp
				+ ", security_typ2=" + securityTyp2 + ", maturity=" + maturity + ", cpn=" + cpn + ", cpn_typ="
				+ cpnTyp + ", cpn_freq=" + cpnFreq + ", issue_dt=" + issueDt + ", first_cpn_dt=" + firstCpnDt
				+ ", nxt_cpn_dt=" + nxtCpnDt + ", prev_cpn_dt=" + prevCpnDt + ", create_date=" + createDate
				+ ", user_create=" + userCreate + ", update_date=" + updateDate + ", user_update=" + userUpdate
				+ "]";
	}

}	