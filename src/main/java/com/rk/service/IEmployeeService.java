package com.rk.service;

import java.util.List;
import java.util.Optional;

import com.rk.model.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	void updateEmployee(Employee e);

	void deleteEmployee(Integer id);
	Optional<Employee> getOneEmployee(Integer id);

	List<Employee> getAllEmployees();
	boolean isEmployeeExit(Integer id);
}
