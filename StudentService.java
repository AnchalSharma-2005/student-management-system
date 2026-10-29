package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.model.Student;
import com.springboot.repository.StudentRepository;

@Service
public class StudentService {

	public final StudentRepository studentrepository;

	public StudentService(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	// save
	public Student SaveStudent(Student student) {
		return studentrepository.save(student);
	}

//FindAll
	public List<Student> getAllStudent() {
		return studentrepository.findAll();
	}

//GetStudentById
	public Student getStudentbyId(int id) {
		return studentrepository.findById(id).orElse(null);

	}

// Update Student

	public Student updateStudent(int id, Student student) {
		student.setId(id);
		return studentrepository.save(student);

	}

//delete
	public void deleteStudent(int id) {
		studentrepository.deleteById(id);

	}
}
