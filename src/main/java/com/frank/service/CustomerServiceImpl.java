package com.frank.service;

import java.util.List;

import com.frank.model.Customer;
import com.frank.repository.CustomerRepository;
import com.frank.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.frank.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
