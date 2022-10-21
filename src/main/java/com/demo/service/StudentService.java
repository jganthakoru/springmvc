package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentService {

	
	@Autowired
	StudentDao dao;
	
	
	public void saveStudent(Student student) {
		
		dao.saveStudent(student);
	}
	
	
	public void updateStudnet(Student student) {
		
		dao.updateStudent(student);
		
	}
	
	public void deleteStudent(Long id) {
		
		dao.deleteSudent(id);
	}
	
	public Student getStudentById(Long id) {
		
		return dao.getStudentById(id);
		
	}
	
	public List<Student> getAllStudents(){
		
		return dao.getAllStudents();
		
		
	}
}
