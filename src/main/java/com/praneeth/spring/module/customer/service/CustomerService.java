package com.praneeth.spring.module.customer.service;

import java.util.List;

import com.praneeth.spring.module.customer.model.Customer;

public interface CustomerService {
	void add(Customer customer);
    List<Customer> listCustomers();
    Customer getById(long id); 
}
