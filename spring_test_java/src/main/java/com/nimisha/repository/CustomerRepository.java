package com.nimisha.repository;

import java.util.List;

import com.nimisha.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}