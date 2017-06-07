package com.praneeth.spring.module.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.praneeth.spring.module.customer.model.Customer;
import com.praneeth.spring.module.customer.model.User;
import com.praneeth.spring.module.customer.service.CustomerService;



@RestController
@RequestMapping(value="/")	
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@CrossOrigin
	@GetMapping("/customer")
	public Customer getById(@RequestParam long id){
		return customerService.getById(id);
	}
	
	@CrossOrigin
	@PostMapping("/add")
	public void addCustomer(@RequestBody Customer customer){
		customerService.add(customer);
	}
	
	@CrossOrigin
	@PostMapping("/signup")
	public User signUp(@RequestBody User user){
		return user;
		
	}
	@CrossOrigin
	@GetMapping("/all")
	public List<Customer> getAll(){
		return customerService.listCustomers();
	}

}
