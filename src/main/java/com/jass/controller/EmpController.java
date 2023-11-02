package com.jass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jass.entities.Employee;
import com.jass.repository.EmployeeRepo;

@RestController
public class EmpController 
{
	@Autowired
	private EmployeeRepo repo;
	
	//@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees()
	{
		return repo.findAll();
	}
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee emp)
	{
		repo.save(emp);
	}
	
	
	
	
	
	
}
