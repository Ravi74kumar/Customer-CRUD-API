package com.shellCompany.Ravikumar.CRED.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shellCompany.Ravikumar.CRED.Entity.Customer;
import com.shellCompany.Ravikumar.CRED.Entity.Transaction;
import com.shellCompany.Ravikumar.CRED.Repository.JPARepo;

import java.util.List;

@RestController
public class MainController {
	
	@Autowired
	JPARepo jpaRepo;
	
	@RequestMapping(method= RequestMethod.GET, path = "/getAll")
	public List<Customer> getAll() {
		List<Customer> all = jpaRepo.findAll();
		return all;
	}

}
