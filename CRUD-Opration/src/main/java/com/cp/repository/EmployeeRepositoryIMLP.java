package com.cp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cp.bean.Employee;
import com.cp.repository.EmployeeRepository;

@Repository(value = "empdao")
public class EmployeeRepositoryIMLP {
	
	@Autowired
	EmployeeRepository repo;
	//getting all data of table
	public List<Employee> getAllEmployee()
	{
		List<Employee> emps = (List<Employee>) repo.findAll();
		return emps;
	}
	
	//getting one record of table
	public Optional<Employee> getEmployee(int id)
	{
		Optional<Employee> emp=repo.findById(id);
		return emp;
	}
	// insert into table
	public Employee insertEmployee(Employee emp)
	{
		Employee save = repo.save(emp);
		return save;
	}
	//delete a record
	public void deleteEmployee(int id)
	{
		repo.deleteById(id);	
	}
	//count the no of employee
	public long noOfEmployee()
	{
		long count=repo.count();
		return count;
	}
	//searching Employee record
	public boolean search(int id)
	{
		boolean b1=repo.existsById(id);
		return b1;
	}
	

}
