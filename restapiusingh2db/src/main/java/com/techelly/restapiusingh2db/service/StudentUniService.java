package com.techelly.restapiusingh2db.service;

import com.techelly.restapiusingh2db.entities.StudentUni;

public interface StudentUniService {
	//Create or save or add
	public StudentUni createStudent(StudentUni student);
	//Retrieve or get student on the basis of Primary Key
	public StudentUni retrieveStudent(Integer studentId);
	//Update
	public StudentUni updateStudent(StudentUni student);
	//Delete
	public String deleteStudent(Integer studentId);
}
