package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class StudentDao {
	
	@Autowired
	HibernateTemplate template;
	
	
	@Transactional
	public void saveStudent(Student student) {
		template.save(student);
	}
	
	public List<Student> getAllStudents(){
		
		return template.loadAll(Student.class);
	}
	
	@Transactional
	public void updateStudent(Student student) {
		template.update(student);
	}

	@Transactional
	public void deleteSudent(Long id) {
		template.delete(template.load(Student.class, id));
	}
	
	public Student getStudentById(Long id) {
		
		return template.get(Student.class, id);	
	}
	
}
