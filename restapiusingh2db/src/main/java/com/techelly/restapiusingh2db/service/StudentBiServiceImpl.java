package com.techelly.restapiusingh2db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techelly.restapiusingh2db.dao.StudentBiRepository;
import com.techelly.restapiusingh2db.entities.StudentBi;

@Service
public class StudentBiServiceImpl implements StudentBiService {
	
	@Autowired
	private StudentBiRepository repo;
	@Override
	public StudentBi createStudent(StudentBi student) {
		return repo.save(student);
	}

	@Override
	public StudentBi retrieveStudent(Integer studentId) {
		Optional<StudentBi> stud=repo.findById(studentId);
		if(stud.isPresent()) {
			return stud.get();
		}else {
			return null;
		}
	}

	@Override
	public StudentBi updateStudent(StudentBi student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer studentId) {
		repo.deleteById(studentId);
		return "Deleted Successfully";
	}

}
