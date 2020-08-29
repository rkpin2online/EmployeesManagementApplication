package com.rk.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.model.Employee;
import com.rk.service.IEmployeeService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService service;

	@GetMapping("/employees")
	public List<Employee> getAllEmp() {
		return service.getAllEmployees();
	}
}
