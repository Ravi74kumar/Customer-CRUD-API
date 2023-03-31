package com.shellCompany.Ravikumar.CRED.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shellCompany.Ravikumar.CRED.Entity.Customer;
import com.shellCompany.Ravikumar.CRED.Entity.Transaction;

@Repository
public interface JPARepo extends JpaRepository<Customer, Long>{
	
	

}
