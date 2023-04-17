package com.techelly.restapiusingh2db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techelly.restapiusingh2db.dao.StudentRepository;
import com.techelly.restapiusingh2db.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student retrieveStudent(Integer studentId) {
		Optional<Student> stud=studentRepo.findById(studentId);
			if(stud.isPresent()) {
				return stud.get();
			}else {
				return null;
			}
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
