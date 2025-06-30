package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
