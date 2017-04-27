package com.rms.main;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.rms.pojo.Employee;

@Service
@Scope("singleton")
public class EmployeeData {

	private List<Employee> employeeList;
	
	public EmployeeData() {
		
	}
}
