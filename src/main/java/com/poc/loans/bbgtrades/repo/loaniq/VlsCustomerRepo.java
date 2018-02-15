package com.poc.loans.bbgtrades.repo.loaniq;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VlsCustomerRepo extends CrudRepository<VlsCustomer, String>  {
	
	@Query("select distinct c from VlsCustomer c left join fetch c.locations left join fetch c.aliases where c.cusCdeCustDesc = 'FMA' and c.cusCdeDept <> 'INACT'")
	List<VlsCustomer> getAllQualitifedCustomers();
	
	//List<VlsCustomer> findByCusCdeCustDescEqualsAndCusCdeDeptNot(String cusCdeCustDesc, String cusCdeDepts);
	
	//List<VlsCustomer> findByCusCdeDeptIn(List<String> cusCdeDept);
	
	//List<VlsCustomer> findByCusCdeDeptNot(String cusCdeDepts);
}
