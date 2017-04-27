package com.rms.main;

import java.util.List;

import com.rms.pojo.Employee;

public interface EmployeeService {
	
	public List<Employee> list();
	
	public void update(Employee employee);
	
	public void add(Employee employee);
	
	public void delete(String id);
	
}
