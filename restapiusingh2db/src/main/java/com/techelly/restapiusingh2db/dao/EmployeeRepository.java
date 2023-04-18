package com.techelly.restapiusingh2db.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techelly.restapiusingh2db.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
