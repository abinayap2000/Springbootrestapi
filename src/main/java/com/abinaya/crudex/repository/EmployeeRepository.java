package com.abinaya.crudex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abinaya.crudex.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
