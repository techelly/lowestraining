package com.lowes.helloworld.service;

import com.lowes.helloworld.model.Employee;

public interface EmployeeService {
	//C - Create or Insert
	public Employee saveEmployee(Employee employee);
	//R - Retrieve or find 
	public Employee getEmployeeById(Integer empId);
	//U - Update a record
	public Employee updateEmployee(Employee employee);
	//D - Delete a record 
	public void deleteEmployeeById(Integer empId);
	
}
