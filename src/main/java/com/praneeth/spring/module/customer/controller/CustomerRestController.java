package com.praneeth.spring.module.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.praneeth.spring.module.customer.model.Customer;
//import com.praneeth.spring.module.customer.service.CustomerService;



@RestController

public class CustomerRestController {
	@GetMapping("/ela")
	public String getLand(){
		return "hello";
	}
//	@Autowired
//	CustomerService customerService;
//
//	@CrossOrigin
//	@GetMapping("/customer")
//	public Customer getCustomers() {
//		Customer customer=new Customer();
//		customer.setFirstName("Praneeth");
//		customer.setId(1L);
//		return customer;
//	}
//	@PostMapping("/create")
//	public void createCustomers(){
//		customerService.add(new Customer(1,"Sunil"));
//		customerService.add(new Customer(2,"David"));
//		customerService.add(new Customer(3,"Sameer"));
//		customerService.add(new Customer(4,"Paul"));
//	}


}
