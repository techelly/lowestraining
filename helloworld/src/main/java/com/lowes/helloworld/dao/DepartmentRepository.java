package com.lowes.helloworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lowes.helloworld.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
	//Retrieve data using non primary key
	public Department findByDeptName(String deptName);
	
	public void deleteByDeptName(String deptName);
	
}
