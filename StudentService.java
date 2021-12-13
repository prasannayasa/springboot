package com.example.webApp4.service;

import org.springframework.stereotype.Service;

import com.example.webApp4.entity.Student;

@Service("StudentServiceImp")
public interface StudentService
{

	void save(Student emp);
	void update(Student emp);
	void delete(Student emp);
	void get(Student emp);

}
