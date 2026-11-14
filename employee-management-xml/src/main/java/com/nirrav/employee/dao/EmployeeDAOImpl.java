package com.nirrav.employee.dao;

import java.util.ArrayList;
import java.util.List;

import com.nirrav.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private final List<Employee> employees= new ArrayList<>();
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employees.add(employee);
		System.out.println("Employee added successfully");
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if(employee.getEmployeeId()==employeeId) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public void updateSalary(int employeeId, double salary) {
		// TODO Auto-generated method stub
		Employee employee= getEmployeeById(employeeId);
		
		if(employee != null) {
			employee.setSalary(salary);
			
			System.out.println("Salary Updated");
		}
		else {
			System.out.println("Employee not found");
		}
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee= getEmployeeById(employeeId);
		
		if(employee!= null) {
			employees.remove(employee);
			
			System.out.println("Employee deleted successfully");
		}
		else {
			System.out.println("Employee not found");
		}
	}

}
