package com.nimisha.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nimisha.model.Customer;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	/* (non-Javadoc)
	 * @see com.nimisha.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll () {
List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Bryan");
		customer.setLastname("Hansen");
		
		customers.add(customer);
		
		return customers;
	}
}
