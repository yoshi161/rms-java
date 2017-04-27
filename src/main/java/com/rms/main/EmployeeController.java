package com.rms.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.pojo.Employee;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/api/employees", 
    		method = RequestMethod.GET, 
    		produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Employee> getEmployees() {
    	return employeeService.list();
    }

    @RequestMapping(value = "/api/employees", 
    		method = RequestMethod.POST, 
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Employee employee) {
    	employeeService.update(employee);
    }

    @RequestMapping(value = "/api/employees", 
    		method = RequestMethod.PUT, 
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Employee employee) {
    	employeeService.add(employee);
    }

    @RequestMapping(value = "/api/employees", 
    		method = RequestMethod.DELETE, 
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestBody String id) {
    	employeeService.delete(id);
    }
    
}
