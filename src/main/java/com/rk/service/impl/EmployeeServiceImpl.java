package com.rk.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.model.Employee;
import com.rk.repository.EmployeeRepo;
import com.rk.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	@Transactional
	public Integer saveEmployee(Employee e) {
		Integer id = repo.save(e).getId();
		return id;
	}

	@Override
	@Transactional
	public void updateEmployee(Employee e) {
		repo.save(e);
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Employee> getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		return opt;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public boolean isEmployeeExit(Integer id) {
		boolean exists = repo.existsById(id);
		return exists;
	}

}
