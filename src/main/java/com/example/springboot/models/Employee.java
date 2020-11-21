package com.example.springboot.models;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {
	
	private String name;
	private int empId;
	private Date dob;

}
