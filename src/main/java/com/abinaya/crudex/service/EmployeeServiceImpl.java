package com.abinaya.crudex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abinaya.crudex.entity.Employee;
import com.abinaya.crudex.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

	
	@Autowired
	
	EmployeeRepository repo;
	public Employee createEmp(Employee emp) {
		return repo.save(emp);
		
	}
	
	public List<Employee> getEmployees() {
		return repo.findAll();
		
	}

	@Override
	public Employee updateEmp(Employee emp, int id) {
		Employee Emp=repo.findById(id).orElse(null);
		Emp.setId(emp.getId());
		Emp.setemp_name(emp.getemp_name());
		Emp.setSalary(emp.getSalary());
		Emp.setDesignation(emp.getDesignation());
		return Emp;
	}

	
	
}

