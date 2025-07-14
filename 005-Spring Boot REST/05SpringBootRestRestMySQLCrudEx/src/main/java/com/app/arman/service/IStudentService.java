package com.app.arman.service;

import java.util.List;

import com.app.arman.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);
	List<Student> getAllStudents();
	Student getOneStudent(Integer id);
	void deleteStudent(Integer id);
	void updateStudent(Student student);
}
