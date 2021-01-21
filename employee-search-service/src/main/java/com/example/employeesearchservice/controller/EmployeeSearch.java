package com.example.employeesearchservice.controller;

import java.util.List;

import com.example.employeesearchservice.entity.Employee;
public interface EmployeeSearch {
	public Employee getEmployeeById(int id);
	public String addEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public String removeEmployeeById(int id);
	public List<Employee> getAllEmployee();
}
