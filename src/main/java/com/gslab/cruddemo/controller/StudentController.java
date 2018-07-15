package com.gslab.cruddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gslab.cruddemo.entity.Student;
import com.gslab.cruddemo.service.StudentService;

@RestController
@RequestMapping(value="api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping(value="/create")
	public Student createStudent(Student student) {
		return studentservice.createStudent(student);
	}
}
