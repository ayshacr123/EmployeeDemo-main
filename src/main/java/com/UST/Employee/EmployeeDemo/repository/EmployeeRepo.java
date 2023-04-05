package com.UST.Employee.EmployeeDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.Employee.EmployeeDemo.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

}

