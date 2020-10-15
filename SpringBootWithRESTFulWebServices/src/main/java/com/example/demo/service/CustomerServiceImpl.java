package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;



@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository CUSRep;
	
	 @Override
	 public void save(Customer customer) {
	        customer.setEmail(customer.getEmail());
	        customer.setDescription(customer.getDescription());
	        customer.setName(customer.getName());
	        CUSRep.save(customer);
	    }

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

	}
