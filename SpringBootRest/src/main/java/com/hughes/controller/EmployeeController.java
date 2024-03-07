package com.hughes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hughes.model.Employee;
import com.hughes.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public List<Employee> readEmployees(){
		return empService.getEmployees();
	}
	
	@RequestMapping(value="/insertemployee",method=RequestMethod.POST)
	public Employee InsertEmployee(@RequestBody Employee emp) {
		System.out.println("Insert  Employee");
		return empService.CreateEmployee(emp);
		
	}
	
}
