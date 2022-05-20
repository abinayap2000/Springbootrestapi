package com.abinaya.crudex.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.abinaya.crudex.entity.Employee;

 @Service
 public interface EmployeeService {
	 //create,getemp,getbyid,delete,update
	 public Employee createEmp(Employee emp);
	 public List<Employee> getEmployees();
	 public Employee updateEmp(Employee emp, int id);
	
		

	}



