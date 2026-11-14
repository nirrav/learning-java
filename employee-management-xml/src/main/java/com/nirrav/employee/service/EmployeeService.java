package com.nirrav.employee.service;

import java.util.List;

import com.nirrav.employee.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int employeeId);
	void updateSalary(int employeeId, double salary);
	void deleteEmployee(int employeeId);
}
