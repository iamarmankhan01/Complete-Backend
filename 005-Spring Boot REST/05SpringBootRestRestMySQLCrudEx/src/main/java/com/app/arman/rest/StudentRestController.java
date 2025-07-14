package com.app.arman.rest;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.arman.entity.Student;
import com.app.arman.exception.StudentNotFoundException;
import com.app.arman.service.IStudentService;

@RestController
@RequestMapping("/v1/api/student")
public class StudentRestController {

    @Autowired
    private IStudentService service;

    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody @Valid Student student) {
        Integer id = service.saveStudent(student);
        return new ResponseEntity<>("Student '" + id + "' Created", HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> list = service.getAllStudents();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> fetchOneStudent(@PathVariable Integer id) {
        try {
            Student student = service.getOneStudent(id);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (StudentNotFoundException e) {
            throw e;
        }
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        try {
            service.deleteStudent(id);
            return new ResponseEntity<>("Student '" + id + "' Deleted", HttpStatus.OK);
        } catch (StudentNotFoundException e) {
            throw e;
        }
    }

    @PutMapping("/modify")
    public ResponseEntity<String> updateStudent(@RequestBody @Valid Student student) {
        try {
            service.updateStudent(student);
            return new ResponseEntity<>("Student '" + student.getStdId() + "' Updated", HttpStatus.OK);
        } catch (StudentNotFoundException e) {
            throw e;
        }
    }
}
