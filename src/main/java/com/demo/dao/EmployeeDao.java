package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.demo.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	
	//add employee
	@Transactional
	public void addEmployee(Employee emp) {
		hibernateTemplate.save(emp);
	}
	
	
	//get all employee
	public List<Employee> getAllEmployees(){
		return hibernateTemplate.loadAll(Employee.class);
	}
	
	//get employee by id
	@Transactional
	public Employee getEmployeeById(Long id) {
		return hibernateTemplate.load(Employee.class, id);
	}
	
	//update Employee
	@Transactional
	public void updateEmployee(Employee emp) {	
		 hibernateTemplate.update(emp);
	}
	
	//delete employee by id
	@Transactional
	public void deleteEmployee(Long id) {
		hibernateTemplate.delete(hibernateTemplate.load(Employee.class, id));
	}
	
}
