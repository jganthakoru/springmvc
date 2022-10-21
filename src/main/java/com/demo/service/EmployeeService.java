package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public void addEmployee(Employee emp) {
		dao.addEmployee(emp);
	}
	
	public List<Employee> getAllEmps(){
		
		return dao.getAllEmployees();
	}
	
	public void deleteEmployee(Long id) {
		
		dao.deleteEmployee(id);
	}
	
	public void updateEmp(Employee emp) {
		
		dao.updateEmployee(emp);
	}
	
	public Employee getEmpById(Long id) {
		
		return dao.getEmployeeById(id);
	}	
}