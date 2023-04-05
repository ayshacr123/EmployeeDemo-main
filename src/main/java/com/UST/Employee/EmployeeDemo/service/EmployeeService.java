package com.UST.Employee.EmployeeDemo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.Employee.EmployeeDemo.model.Employee;
import com.UST.Employee.EmployeeDemo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	public Employee createEmployee(Employee employee) {
		
		return repo.save(employee);
	}
	
	

}
