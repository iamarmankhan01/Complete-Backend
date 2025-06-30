package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	

}
