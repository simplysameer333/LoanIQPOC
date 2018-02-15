package com.poc.loans.bbgtrades.repo.bbg;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BBGStagedTradeRepo extends CrudRepository<BBGStagedTrade, Long>  {
	
	List<BBGStagedTrade> findByTradeDateAndStatus(Date tradeDate, String status);
}
