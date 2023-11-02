package com.jass.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jass.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
	List<Employee> findByName(String name);
	List<Employee> findBySalary(double salary);
}
