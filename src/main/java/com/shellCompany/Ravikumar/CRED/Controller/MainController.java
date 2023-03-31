package com.shellCompany.Ravikumar.CRED.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shellCompany.Ravikumar.CRED.Entity.Customer;
import com.shellCompany.Ravikumar.CRED.Repository.JPARepo;
import com.shellCompany.Ravikumar.CRED.dto.CustomerRequest;
import com.shellCompany.Ravikumar.CRED.mapper.CustomerReqMapper;

import java.util.List;

@RestController
@RequestMapping(path = "/CRUD")
public class MainController {
	
	@Autowired
	JPARepo jpaRepo;
	
	@Autowired
	CustomerReqMapper custReqMapper;
	
	@RequestMapping(method= RequestMethod.GET, path = "/getAll")
	public List<Customer> getAll() {
		List<Customer> all = jpaRepo.findAll();
		return all;
	}
	
	@RequestMapping(method= RequestMethod.PUT, path = "/add")
	public byte[] addCustomer(@RequestBody(required = false) CustomerRequest customerReq) {
		
		Customer custDto = custReqMapper.mapCustomerDto(customerReq);
		
		jpaRepo.save(custDto);
		
		return new byte[0];
	}

}
