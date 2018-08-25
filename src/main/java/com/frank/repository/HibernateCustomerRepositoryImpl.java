package com.frank.repository;

import java.util.ArrayList;
import java.util.List;

import com.frank.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.frank.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Frank");
		customer.setLastname("Zhang");

		customers.add(customer);

		return customers;
	}

}
