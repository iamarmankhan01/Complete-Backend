package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
