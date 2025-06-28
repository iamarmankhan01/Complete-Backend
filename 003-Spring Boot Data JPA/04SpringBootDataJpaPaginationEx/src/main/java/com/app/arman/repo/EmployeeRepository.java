package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.Employee;

public interface EmployeeRepository 
extends JpaRepository<Employee, Integer> {

}