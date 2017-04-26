package com.greglturnquist.payroll;

import java.util.List;

public interface EmployeeService {
	
	public List<Employee> list();
	
	public void update(Employee employee);
	
	public void add(Employee employee);
	
	public void delete(String id);
	
}
