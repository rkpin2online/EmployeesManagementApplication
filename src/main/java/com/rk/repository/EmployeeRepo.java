package com.rk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
