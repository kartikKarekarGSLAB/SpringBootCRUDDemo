package com.gslab.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gslab.cruddemo.entity.Student;
import com.gslab.cruddemo.service.StudentService;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app =  SpringApplication.run(SpringCrudApplication.class, args);
		StudentService ss =  app.getBean("studentService",StudentService.class);
		Student s = new Student();
		s.setRollno(101);
		s.setName("kartik");
		
		ss.createStudent(s);
	}
}
