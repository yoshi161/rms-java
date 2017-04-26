package com.greglturnquist.payroll;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class EmployeeData {

	private List<Employee> employeeList;
	
	public EmployeeData() {
		
	}
}
