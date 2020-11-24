package com.example.springboot.services.data;

import java.util.ArrayList;
import java.util.List;

import com.example.springboot.models.Customer;

public class CustomerDataService implements DataService<Customer> {

	@Override
	public List<Customer> getData() {
		// TODO Auto-generated method stub

		List<Customer> customerList = new ArrayList<>();

		for(int i = 0; i < 10 ; i++)
		{
			Customer customer = new Customer();
			customer.setName("A" + i);
			customerList.add(customer);
		}
		return customerList;
	}

}
