package com.lowes.helloworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lowes.helloworld.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	public Employee findByEmpName(String empName);
}
