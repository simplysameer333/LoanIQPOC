package com.poc.loans.bbgtrades.repo.bbg;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RawBBGTradeRepo extends CrudRepository<RawBBGTrade, Integer>  {
	
	public List<RawBBGTrade> findByTradeDateAndStatus(Date tradeDate, String status);
	public List<RawBBGTrade> findByTradeDate(Date tradeDate);
	
	
}
