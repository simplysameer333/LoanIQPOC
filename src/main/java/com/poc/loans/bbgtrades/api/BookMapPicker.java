package com.poc.loans.bbgtrades.api;

import java.util.List;

import com.poc.loans.bbgtrades.repo.bbg.BBGLoaniqBookMap;
import com.poc.loans.bbgtrades.repo.bbg.BBGStagedTrade;

public class BookMapPicker {

	public static BBGLoaniqBookMap pickBookMap(List<BBGLoaniqBookMap> bookMaps, BBGStagedTrade trade) {
		
		if (bookMaps == null) {
			return null;
		} else if (bookMaps.size() == 1) {
			return bookMaps.get(0);
		} else {
			
			for (BBGLoaniqBookMap bm : bookMaps) {
				if (trade.getBbgTradeType() == null && bm.getLiq_exp_code().equals("000300")) {
					return bm;
				} else if (trade.getBbgTradeType().equals("DL") && bm.getLiq_exp_code().equals("000100")) {
					return bm;
				}
			}
			
			// no suitable bookmap to use
			return null;
		}
		
	}
	
}
