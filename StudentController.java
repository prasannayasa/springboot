package com.example.webApp4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.webApp4.entity.Student;
import com.example.webApp4.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService stuService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@RequestBody Student s) {
		stuService.save(s);
		return "Student Saved Successfully";

	}
}
