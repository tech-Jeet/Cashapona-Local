package com.cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping("employees")
	public List<Employee> getEmployee()
	{
		List<Employee> emp=(List<Employee>)repo.findAll();
		 
		return emp;
	}
	
	@PostMapping("employee")
	public Employee createEmloyee(Employee e1) {
		Employee emp= repo.save(e1);
		
		return emp;
	}
	
	@PostMapping("/post")
	public Optional<Employee> getEmployee(int id)
	{
		Optional<Employee> emp=repo.findById(id);
		return emp;
	}
	
	@GetMapping("count")
	public long getCount()
	{
		long count=repo.count();
		
		return count;
	}
	

}
