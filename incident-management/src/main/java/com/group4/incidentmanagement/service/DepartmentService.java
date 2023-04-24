package com.group4.incidentmanagement.service;

import com.group4.incidentmanagement.entities.Department;

public interface DepartmentService {

    //Create or save or add
    public Department createDepartment(Department dept);

    //Retrieve or get department on the basis of Primary Key
    public Department retrieveDepartment(Integer deptId);

    //Update
    public Department updateDepartment(Department department);

    //Delete
    public void deleteDepartment(Integer studentId);

}
