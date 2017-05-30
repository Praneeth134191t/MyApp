package com.praneeth.spring.module.customer.dao;

import java.util.List;

import com.praneeth.spring.module.customer.model.Customer;

public interface CustomerDao {
	void add(Customer customer);
	List<Customer> listCustomers();
	Customer getById(long id);
}
