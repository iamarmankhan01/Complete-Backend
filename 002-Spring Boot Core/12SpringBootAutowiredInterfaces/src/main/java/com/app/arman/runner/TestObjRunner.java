package com.app.arman.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arman.service.EmployeeService;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private EmployeeService service;

	public void run(String... args) throws Exception {
		System.out.println("Hellll");
		System.out.println(service);
	}

}
