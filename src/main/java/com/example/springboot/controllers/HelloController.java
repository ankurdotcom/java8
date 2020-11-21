package com.example.springboot.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.Employee;
import com.example.springboot.services.EmployeeDataService;
import com.example.springboot.services.EmployeeDataServiceImpl;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/employees")
	public List<Employee> employees() {
		EmployeeDataService e = new EmployeeDataServiceImpl();
		return e.getData();
	}

}