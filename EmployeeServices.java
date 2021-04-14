package com.example.EmpliyeesCRUD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examle.EmployeesCRUD.repository.EmployeeRepository;
import com.example.EmployeesCRUD.domain.Employee;

public class EmployeeServices implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRespository;
	
	@Override
	public List<Employee> getAllEmployees() {
	   return employeeRpository.findAll();
	}

}
