package com.example.springboot.services;

import java.util.Collections;
import java.util.List;

import com.example.springboot.models.Customer;

public class CustomerDataService implements DataService<Customer> {

	@Override
	public List<Customer> getData() {
		// TODO Auto-generated method stub
		return Collections.singletonList(new Customer());
	}

}
