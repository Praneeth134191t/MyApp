//package com.praneeth.spring.module.customer.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.praneeth.spring.module.customer.dao.CustomerDao;
//import com.praneeth.spring.module.customer.model.Customer;
//
//public class CustomerServiceImpl implements CustomerService {
//	@Autowired
//	private CustomerDao customerDao;
//	
//	@Transactional
//	@Override
//	public void add(Customer customer) {
//		customerDao.add(customer);
//	}
//	
//	@Transactional(readOnly = true)
//	@Override
//	public List<Customer> listCustomers() {
//		return customerDao.listCustomers();
//	}
//
//}
