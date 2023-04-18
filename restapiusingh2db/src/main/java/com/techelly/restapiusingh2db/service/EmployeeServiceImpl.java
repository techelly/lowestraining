package com.techelly.restapiusingh2db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techelly.restapiusingh2db.dao.EmployeeRepository;
import com.techelly.restapiusingh2db.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	@Override
	public Employee createEmployee(Employee employee) {
		return repo.save(employee);
		
	}

	@Override
	public Employee retrieveEmployee(Integer employeeId) {
		Optional<Employee> emp=repo.findById(employeeId);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return null;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
