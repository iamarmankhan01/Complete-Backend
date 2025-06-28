package com.app.arman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sobj")
public class StudentController {
	@Autowired
	private StudentDao dao;

	@Override
	public String toString() {
		return "StudentController [dao=" + dao + "]";
	}
	

}
