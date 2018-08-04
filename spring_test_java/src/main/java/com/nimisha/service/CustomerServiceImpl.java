package com.nimisha.service;

import java.util.List;

import com.nimisha.model.Customer;
import com.nimisha.repository.CustomerRepository;
import com.nimisha.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.nimisha.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
}
