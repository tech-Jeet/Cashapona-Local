package com.cp.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import com.cp.CrudOprationApplication;
import com.cp.repository.EmployeeRepositoryIMLP;

@Controller
public class EmployeeController {
	
	public static void main(String[] args) {
		
		 ConfigurableApplicationContext run = SpringApplication.run(CrudOprationApplication.class, args);
		
		EmployeeRepositoryIMLP emp=run.getBean("empdao",EmployeeRepositoryIMLP.class);
		//System.out.println(emp.getAllEmployee());
		
		//System.out.println(emp.getEmployee(102));
		
		/*Employee e1=new Employee();
		e1.setId(105);
		e1.setName("rahul");
		e1.setSal(5500);
		System.out.println(emp.insertEmployee(e1));*/
		
		//emp.deleteEmployee(101);
		System.out.println(emp.noOfEmployee());
		
		System.out.println(emp.search(102));
	}

}
