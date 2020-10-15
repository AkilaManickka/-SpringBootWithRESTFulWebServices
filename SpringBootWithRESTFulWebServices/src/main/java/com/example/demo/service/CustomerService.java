package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;


public interface CustomerService {
	 public List<Customer> getAllCustomer();
	 
	 public Customer getCustomerById(int id);
	 
	 void save(Customer customer);
	 
	 public void updateCustomer(Customer customer);
	 
	 public void deleteCustomer(int id);
	 

}
