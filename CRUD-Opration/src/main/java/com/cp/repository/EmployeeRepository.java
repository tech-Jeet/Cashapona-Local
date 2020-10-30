package com.cp.repository;

import org.springframework.data.repository.CrudRepository;

import com.cp.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
