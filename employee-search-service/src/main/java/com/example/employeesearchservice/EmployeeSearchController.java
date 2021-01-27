package com.example.employeesearchservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeSearchController {
	@Autowired
	EmployeeSearch employeeSearch;
	@GetMapping("/employee/find/{id}")
	public Employee findById(@PathVariable int id)
	{
		return employeeSearch.getEmployeeById(id);
	}
	@GetMapping("/employee/findAll")
	public List<Employee> findById()
	{
		return employeeSearch.getAllEmployee();
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee emp)
	{
		employeeSearch.addEmployee(emp);
		return "Employee Addedd Successfully";
				
	}
	
}
