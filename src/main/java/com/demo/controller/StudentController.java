package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Student;
import com.demo.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	StudentService service;
	
	@PostMapping("/saveStudent")
	public void saveStudnet(@ModelAttribute("student") Student student ) {
		service.saveStudent(student);
	}
	
	@PostMapping("/updateStudent")
	public void updateStudent(@ModelAttribute("student")Student studnet) {
		
		service.updateStudnet(studnet);
		
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudents(){
		
		return service.getAllStudents();
	}
	
	
	@GetMapping("/getStudentById")
	public Student getStudent(@PathVariable("id") Long id) {
		
		return service.getStudentById(id);
	}
	
	
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@PathVariable("id")Long id) {
		
		service.deleteStudent(id);
	}

}
