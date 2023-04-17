package com.techelly.restapiusingh2db.service;

import com.techelly.restapiusingh2db.entities.Student;

public interface StudentService {
	//Create or save or add
	public Student createStudent(Student student);
	//Retrieve or get student on the basis of Primary Key
	public Student retrieveStudent(Integer studentId);
	//Update
	public Student updateStudent(Student student);
	//Delete
	public String deleteStudent(Integer studentId);
}
