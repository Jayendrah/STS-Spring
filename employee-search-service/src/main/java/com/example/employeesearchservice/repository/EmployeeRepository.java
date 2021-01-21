package com.example.employeesearchservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesearchservice.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

