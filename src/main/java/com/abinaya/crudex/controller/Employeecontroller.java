package com.abinaya.crudex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abinaya.crudex.entity.Employee;
import com.abinaya.crudex.service.EmployeeService;


@RestController
@RequestMapping("/emp")
public class Employeecontroller {
	@Autowired
	EmployeeService service;
	
	
	@PostMapping("/save")
	public Employee saveEmployee( @RequestBody Employee emp) {
		return service.createEmp(emp);
		
		
	}
	@GetMapping("/getemps")
	public List<Employee> getEmps(){
		return service.getEmployees();
		
	}
	@PutMapping("/update")
	public Employee updateEmployee( @PathVariable int id,
			@RequestBody Employee emp) {
		return service.updateEmp(emp, id);
	}
}
