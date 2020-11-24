/**
 * 
 */
package com.example.springboot.services.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.springboot.models.Employee;

/**
 * @author Ankur
 * @param Employee
 *
 */
public class EmployeeDataService implements DataService<Employee> {

	private static final String DD_MM_YY = "DD/MM/YY";

	@Override
	public List<Employee> getData() {
		List<Employee> employeeList = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(7140);
		emp1.setName("Vishpal");
		try {
			emp1.setDob(new SimpleDateFormat(DD_MM_YY).parse("18/08/70"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		employeeList.add(emp1);
		
		return employeeList;
	}

}
