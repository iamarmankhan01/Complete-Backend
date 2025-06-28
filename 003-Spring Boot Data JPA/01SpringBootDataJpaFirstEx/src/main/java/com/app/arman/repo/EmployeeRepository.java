package com.app.arman.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.arman.entity.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}