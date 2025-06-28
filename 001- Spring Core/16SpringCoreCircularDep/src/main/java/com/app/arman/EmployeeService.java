package com.app.arman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	@Autowired
	private ProjectService pservice;

	
}