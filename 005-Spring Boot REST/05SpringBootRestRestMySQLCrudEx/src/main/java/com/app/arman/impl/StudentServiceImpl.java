package com.app.arman.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.arman.entity.Student;
import com.app.arman.exception.StudentNotFoundException;
import com.app.arman.repo.StudentRepository;
import com.app.arman.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	public Integer saveStudent(Student student) {
		Integer id = repo.save(student).getStdId();
		return id;
	}

	public List<Student> getAllStudents() {
		List<Student> list = repo.findAll();
		return list;
	}

	
	public Student getOneStudent(Integer id) {
		return repo.findById(id)
				.orElseThrow(
						()->new StudentNotFoundException("Student '"+id+"' not exist")
						);
	}

	public void deleteStudent(Integer id) {
		repo.delete(getOneStudent(id));
	}

	
	public void updateStudent(Student student) {
		if(student.getStdId()==null || !repo.existsById(student.getStdId()))
			throw new StudentNotFoundException("Student '"+student.getStdId()+"' not exist");
		else
			repo.save(student);
	}

}
