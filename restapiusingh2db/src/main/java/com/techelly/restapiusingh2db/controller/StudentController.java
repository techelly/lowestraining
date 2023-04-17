package com.techelly.restapiusingh2db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techelly.restapiusingh2db.entities.Student;
import com.techelly.restapiusingh2db.service.StudentService;

@RestController
public class StudentController {
		
		@Autowired
		private StudentService studentService;
	
		//Create or save or add
		//http://localhost:8080/addstudent
	 	@PostMapping("/addstudent")
		public Student createStudent(@RequestBody Student student) {
			return studentService.createStudent(student);
		}
		//Retrieve or get student on the basis of Primary Key
	 	//http://localhost:8080/getstudentbyid/1
	 	@GetMapping("/getstudentbyid/{id}")
		public Student retrieveStudent(@PathVariable("id")Integer studentId) {
			return studentService.retrieveStudent(studentId);
		}
}
