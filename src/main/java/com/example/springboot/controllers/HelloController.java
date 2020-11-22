package com.example.springboot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.Customer;
import com.example.springboot.models.Employee;
import com.example.springboot.models.Items;
import com.example.springboot.services.data.CustomerDataService;
import com.example.springboot.services.data.DataService;
import com.example.springboot.services.data.EmployeeDataService;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/employees")
	public List<Employee> employees() {
		DataService<Employee> employeeDataService = new EmployeeDataService();
		List<Employee> data = employeeDataService.getData();
		return data;
	}
	
	@RequestMapping("/customers")
	public List<Customer> customers() {
		DataService<Customer> customerDataService = new CustomerDataService();
		List<Customer> data = customerDataService.getData();
		return data;
	}
	
	@RequestMapping("/items")
	public List<Items> items() {//TODO
		DataService<Items> customerDataService = null;
		List<Items> data = customerDataService.getData();
		return data;
	}

}