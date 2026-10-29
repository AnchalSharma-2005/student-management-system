package com.springboot.controller;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final StudentService studentservice;

	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}

	// Add student
	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return studentservice.SaveStudent(student);

	}

	// get all students
	@GetMapping
	public List<Student> getAllStudent() {
		return studentservice.getAllStudent();

	}

	// Get by Id
	@GetMapping("/{id}")
	public Student getById(@PathVariable int id) {
		return studentservice.getStudentbyId(id);
	}

	// Update student
	@PutMapping("/{id}")
	public Student UpdateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentservice.updateStudent(id, student);

	}
	//Delete Student
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentservice.deleteStudent(id);
	}
	
}
