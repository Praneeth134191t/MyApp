package com.praneeth.spring.module.customer.model;


public class Customer {

	private Long id;
	private String firstName;

	public Customer(long id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

	public Customer() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
