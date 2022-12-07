package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.entity.Employee;
import com.emp.exception.ResourceNotFoundExceptionHandler;
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
		return iEmployeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		return iEmployeeRepo.findById(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		iEmployeeRepo.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		// lets check if the employee exists with the given value or not 
		Employee existingEmployee = iEmployeeRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Employee", "id", id));
		
		existingEmployee.setEmpName(employee.getEmpName());
		existingEmployee.setEmpPosition(employee.getEmpPosition());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setSalary(employee.getSalary());
		
		iEmployeeRepo.save(existingEmployee);
		return existingEmployee;
	}

}
