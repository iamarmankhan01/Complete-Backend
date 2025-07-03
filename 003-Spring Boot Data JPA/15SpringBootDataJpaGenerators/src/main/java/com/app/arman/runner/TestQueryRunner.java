package com.app.arman.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arman.entity.Employee;
import com.app.arman.repo.EmployeeRepository;

@Component
public class TestQueryRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		Employee e = new Employee();
		e.setEmpDept("DEV");
		e.setEmpName("AJAY");
		e.setEmpSal(300.0);
		repo.save(e);
	}
}


