package com.poc.loans.bbgtrades.repo.loaniq;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VlsMisCodeRepo extends CrudRepository<VlsMisCode, String>  {

	List<VlsMisCode> findByMicCdeProdTypeStartingWithAndMicCdeMisType(String micCdeProdType, String micCdeMisType);
	
}
