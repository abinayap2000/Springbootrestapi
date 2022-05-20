
package com.abinaya.crudex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "emp_name")
	private String emp_name;
	@Column
	private float salary;
	@Column
	private String designation;
	
	public Employee() {
		//
	}

	public Employee(String emp_name, float salary, String designation) {
		super();
		this.emp_name = emp_name;
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getemp_name() {
		return emp_name;
	}

	public void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
