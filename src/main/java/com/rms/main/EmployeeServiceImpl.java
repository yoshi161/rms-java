package com.rms.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.springframework.stereotype.Service;

import com.rms.pojo.Employee;
import com.rms.pojo.Family;
import com.rms.pojo.History;
import com.rms.pojo.Location;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static Logger LOGGER = Logger.getLogger(EmployeeServiceImpl.class);
	private List<Employee> employees;
	
	public EmployeeServiceImpl() {
		employees = new ArrayList<Employee>(){
        	{
        		add(new Employee("yosua_s", "Yosua",
        				"Simaremare", "SE2", "M", "Nope", "Indonesia",
        				"Single", "+123 123 123", "Java Bootcamp", 
        				"P", "CDC", "yosua@gmail.com", "JOG", true, null, 
        				new ArrayList<Location>(){{
        					add(new Location(new Date(), new Date(), "JOG", "Jl. Raya Taman Bungkul") );
        					add(new Location(new Date(), new Date(), "DPS", "Jl. Raya Taman Bungkul II") );
        				}},
        				new ArrayList<History>() {{
        					add(new History());
        				}},
        				new ArrayList<Family>() {{
        					add(new Family("Siti Aminah", "M", new Date(), "W", true));
        				}}));
        		
        		add(new Employee("don_c", "Don",
        				"Corleone", "SE2", "M", "Nope", "Indonesia",
        				"Single", "+123 123 123", "Java Bootcamp", 
        				"P", "CDC", "don@gmail.com", "JOG", true, null, 
        				new ArrayList<Location>(){{
        					add(new Location(new Date(), new Date(), "JOG", "Jl. Raya Taman Bungkul") );
        					add(new Location(new Date(), new Date(), "DPS", "Jl. Raya Taman Bungkul") );
        				}},
        				new ArrayList<History>() {{
        					add(new History());
        				}},
        				new ArrayList<Family>() {{
        					add(new Family("Siti Aminah", "M", new Date(), "W", true));
        				}}));
        	}
    	};
	}
	
	
	@Override
	public List<Employee> list() {
		LOGGER.log(Priority.INFO, "Employee List");
		return employees;
	}

	@Override
	public void update(Employee employee) {

		LOGGER.log(Priority.INFO, "Employee Update");
		for (Iterator<Employee> iter = employees.iterator(); iter.hasNext(); ) {
			Employee element = iter.next();
			if (element.getUserName().equals(employee.getUserName())) {
				//element = employee;
				Integer index = employees.indexOf(element);
				employees.set(index, employee);
				break;
			}
		}
	}


	@Override
	public void add(Employee employee) {
		LOGGER.log(Priority.INFO, "Employee Add");
		employees.add(employee);
	}


	@Override
	public void delete(String id) {

		LOGGER.log(Priority.INFO, "Employee Delete");
		for (Iterator<Employee> iter = employees.iterator(); iter.hasNext(); ) {
			Employee element = iter.next();
			if (element.getUserName().equals(id)) {
				iter.remove();
				break;
			}
		}
		
	}

}
