package com.gslab.cruddemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gslab.cruddemo.entity.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer>{
	
}
