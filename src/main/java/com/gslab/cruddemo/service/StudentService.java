package com.gslab.cruddemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gslab.cruddemo.dao.StudentDAO;
import com.gslab.cruddemo.entity.Student;

@Service
public class StudentService {

		
	@Autowired
	private StudentDAO studentDAO;
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.save(student);
	}

}
