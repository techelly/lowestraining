package com.techelly.restapiusingh2db.association.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techelly.restapiusingh2db.entities.StudentUni;
import com.techelly.restapiusingh2db.service.StudentUniService;

@RestController
public class StudentUniController {

	@Autowired
	private StudentUniService studentUniService;

	// Create or save or add
	// http://localhost:8080/addstudentuni
	@PostMapping("/addstudentuni")
	public StudentUni createStudentUni(@RequestBody StudentUni student) {
		return studentUniService.createStudent(student);
	}

	// Retrieve or get student on the basis of Primary Key
	// http://localhost:8080/getstudentunibyid/1
	@GetMapping("/getstudentunibyid/{id}")
	public StudentUni retrieveStudentUni(@PathVariable("id") Integer studentId) {
		return studentUniService.retrieveStudent(studentId);
	}
	
	//Delete Student by id 
	// http://localhost:8080/deletestudentunibyid/1
	@DeleteMapping("/deletestudentunibyid/{id}")
	public String deleteStudentUni(@PathVariable("id") Integer studentId) {
		return studentUniService.deleteStudent(studentId);
	}
}
