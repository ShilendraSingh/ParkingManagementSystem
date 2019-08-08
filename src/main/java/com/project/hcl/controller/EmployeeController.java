package com.project.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hcl.entity.EmployeeEntity;
import com.project.hcl.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/parking")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	@GetMapping("/seniorlevel")
	public List<?> getenployee(EmployeeEntity employeeentity) {
		
		
		return employeeService.getSeniorLeve();
		
	}

}
