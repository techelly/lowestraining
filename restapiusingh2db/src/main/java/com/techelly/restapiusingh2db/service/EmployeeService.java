package com.techelly.restapiusingh2db.service;

import com.techelly.restapiusingh2db.entities.Employee;

public interface EmployeeService {
	//Create or save or add
	public Employee createEmployee(Employee employee);
	//Retrieve or get employee on the basis of Primary Key
	public Employee retrieveEmployee(Integer employeeId);
	//Update
	public Employee updateEmployee(Employee employee);
	//Delete
	public String deleteEmployee(Integer employeeId);
}
