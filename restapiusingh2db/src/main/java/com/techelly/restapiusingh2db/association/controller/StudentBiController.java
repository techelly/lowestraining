package com.techelly.restapiusingh2db.association.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techelly.restapiusingh2db.entities.StudentBi;
import com.techelly.restapiusingh2db.service.StudentBiService;

@RestController
public class StudentBiController {

	@Autowired
	private StudentBiService studentBiService;

	// Create or save or add
	// http://localhost:8080/addstudentbi
	@PostMapping("/addstudentbi")
	public StudentBi createStudentBi(@RequestBody StudentBi student) {
		return studentBiService.createStudent(student);
	}

	// Retrieve or get student on the basis of Primary Key
	// http://localhost:8080/getstudentbibyid/1
	@GetMapping("/getstudentbibyid/{id}")
	public StudentBi retrieveStudentBi(@PathVariable("id") Integer studentId) {
		return studentBiService.retrieveStudent(studentId);
	}
	
	//Delete Student by id 
	// http://localhost:8080/deletestudentbibyid/1
	@DeleteMapping("/deletestudentbibyid/{id}")
	public String deleteStudentBi(@PathVariable("id") Integer studentId) {
		return studentBiService.deleteStudent(studentId);
	}
}
