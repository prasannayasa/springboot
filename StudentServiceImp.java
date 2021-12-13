package com.example.webApp4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webApp4.dao.StudentRepository;
import com.example.webApp4.entity.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository repo;

	@Override
	public void save(Student s) {
		repo.save(s);
		System.out.println("Students Saved Successfully");
	}

	@Override
	public void update(Student emp) 
	{
		
		repo.save(emp);
		System.out.println("Student updated Successfully");
		
	}

	@Override
	public void delete(Student emp) 
	{
		repo.deleteById(1);
		System.out.println("Student deleted Successfully");
		
	}

	@Override
	public void get(Student emp) 
	{
		repo.save(emp);
		System.out.println("Student created Successfully");
		
	}
}