package com.poc.loans.bbgtrades.repo.loaniq;


import org.springframework.data.repository.CrudRepository;

public interface VlsFacPortPosRepo extends CrudRepository  {

	public VlsFacPortPos findByFppPidFacilityAndFppCdeExpenseStartingWithAndFppCdePortfolioStartingWithAndFppCdeBranchStartingWith(String fppPidFacility, 
			String fppCdeExpense, String fppCdePortfolio, String fppCdeBranch);
	
}
