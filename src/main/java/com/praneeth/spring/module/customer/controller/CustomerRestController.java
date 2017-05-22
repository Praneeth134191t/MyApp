package com.praneeth.spring.module.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praneeth.spring.module.customer.model.Customer;



@RestController
public class CustomerRestController {


	
	@GetMapping("/customer")
	public Customer getCustomers() {
		Customer customer=new Customer();
		customer.setFirstName("Praneeth");
		customer.setId(1L);
		return customer;
	}



}
