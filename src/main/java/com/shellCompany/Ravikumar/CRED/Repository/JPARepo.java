package com.shellCompany.Ravikumar.CRED.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shellCompany.Ravikumar.CRED.Entity.Customer;
import com.shellCompany.Ravikumar.CRED.Entity.Transaction;

@Repository
public interface JPARepo extends JpaRepository<Customer, Long>{
	
	@Query(value = "select customer from Customer customer where customer.custId=:id")
	public List<Customer> getCustomerById(@Param(value = "id") Long id);
	
}
