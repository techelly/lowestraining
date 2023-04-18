package com.techelly.restapiusingh2db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techelly.restapiusingh2db.dao.StudentUniRepository;
import com.techelly.restapiusingh2db.entities.StudentUni;

@Service
public class StudentUniServiceImpl implements StudentUniService {
	
	@Autowired
	private StudentUniRepository studentUniRepo;
	@Override
	public StudentUni createStudent(StudentUni student) {
		return studentUniRepo.save(student);
	}

	@Override
	public StudentUni retrieveStudent(Integer studentId) {
		Optional<StudentUni> stud=studentUniRepo.findById(studentId);
		if(stud.isPresent()) {
			return stud.get();
		}else {
			return null;
		}
	}

	@Override
	public StudentUni updateStudent(StudentUni student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer studentId) {
		studentUniRepo.deleteById(studentId);
		return "Deleted Successfully";
	}

}
