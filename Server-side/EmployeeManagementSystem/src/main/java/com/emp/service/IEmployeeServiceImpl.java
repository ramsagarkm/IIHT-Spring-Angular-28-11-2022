package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.entity.Employee;
import com.emp.repository.IEmployeeRepo;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee saveEmployee = iEmployeeRepo.save(employee);
		return saveEmployee.getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = iEmployeeRepo.findAll();
		return employeeList;
	}

}
