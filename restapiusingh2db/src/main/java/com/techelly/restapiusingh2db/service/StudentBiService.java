package com.techelly.restapiusingh2db.service;

import com.techelly.restapiusingh2db.entities.StudentBi;

public interface StudentBiService {
	//Create or save or add
	public StudentBi createStudent(StudentBi student);
	//Retrieve or get student on the basis of Primary Key
	public StudentBi retrieveStudent(Integer studentId);
	//Update
	public StudentBi updateStudent(StudentBi student);
	//Delete
	public String deleteStudent(Integer studentId);
}
