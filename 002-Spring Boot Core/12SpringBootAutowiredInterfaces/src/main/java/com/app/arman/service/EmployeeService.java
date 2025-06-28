package com.app.arman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.arman.repo.EmployeeRepository;

@Component
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

}
