package com.group4.incidentmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.group4.incidentmanagement.entities.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
