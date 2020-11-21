/**
 * 
 */
package com.example.springboot.services;

import java.util.Collections;
import java.util.List;

import com.example.springboot.models.Employee;

/**
 * @author Ankur
 * @param Employee
 *
 */
public class EmployeeDataServiceImpl implements EmployeeDataService {

	@Override
	public List<Employee> getData() {
		
		
		return Collections.singletonList(new Employee());
	}

}
