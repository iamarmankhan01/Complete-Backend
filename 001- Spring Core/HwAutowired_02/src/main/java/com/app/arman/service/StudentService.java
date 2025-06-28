package com.app.arman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.arman.controller.StudentController;

@Component("ss")
public class StudentService {
	
	@Autowired
	private StudentController sc;

	@Override
	public String toString() {
		return "StudentService [sc=" + sc + "]";
	}
	
	

}
