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
public class EmployeeDataService implements DataService<Employee> {

	@Override
	public List<Employee> getData() {
		return Collections.singletonList(new Employee());
	}

}
