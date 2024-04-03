package com.example.apidemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apidemo.entity.Student;
import com.example.apidemo.repo.StudentRepo;

@Service
public class StudentServices {
	@Autowired
	private StudentRepo studentRepo;
	public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
	public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
	public Optional<Student> getStudentById(long id) {
        return studentRepo.findById(id);
    }
	public Student updateStudent(long id, Student updatedStudent) {
        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()) {
            Student existingStudent = student.get();
            existingStudent.setStudentName(updatedStudent.getStudentName());
            existingStudent.setStudentEmail(updatedStudent.getStudentEmail());
            existingStudent.setStudentAddress(updatedStudent.getStudentAddress());
            return studentRepo.save(existingStudent);
        } else {
            return null;
        }
	}

}
