package com.example.springboot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.Employee;
import com.example.springboot.services.DataService;
import com.example.springboot.services.EmployeeDataServiceImpl;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/employees")
	public List<Employee> employees() {
		DataService<Employee> employeeDataServiceImpl = new EmployeeDataServiceImpl();
		List<Employee> data = employeeDataServiceImpl.getData();
		return data;
	}

}