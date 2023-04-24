package com.group4.incidentmanagement.dao;

import com.group4.incidentmanagement.entities.Department;
import org.springframework.data.repository.CrudRepository;
import com.group4.incidentmanagement.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


    public User findUserByUserNameAndDepartment(String userName, Department dept);
}
