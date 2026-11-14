package com.nirrav.employee.dao;

import java.util.List;

import com.nirrav.employee.model.Employee;

public interface EmployeeDAO {

	void addEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int employeeId);
	void updateSalary(int employeeId, double salary);
	void deleteEmployee(int employeeId);
}
