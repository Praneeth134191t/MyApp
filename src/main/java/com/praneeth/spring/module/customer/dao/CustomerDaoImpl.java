package com.praneeth.spring.module.customer.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praneeth.spring.module.customer.model.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);
		
	}

	@Override
	public List<Customer> listCustomers() {
	      @SuppressWarnings("unchecked")
	      TypedQuery<Customer> query=sessionFactory.getCurrentSession().createQuery("from Customer");
	      return query.getResultList();
	}

	@Override
	public Customer getById(long id) {
		 return sessionFactory.getCurrentSession().get(Customer.class, id);
	}	
}
