package com.nirrav.employee.bo;

import java.util.List;

import com.nirrav.employee.dao.EmployeeDAO;
import com.nirrav.employee.model.Employee;

public class EmployeeBOImpl implements EmployeeBO {

    private final EmployeeDAO employeeDAO;

    public EmployeeBOImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void addEmployee(Employee employee) {

        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }

        if (employee.getEmployeeId() <= 0) {
            throw new IllegalArgumentException("Employee ID must be greater than zero.");
        }

        if (employee.getEmployeeName() == null ||
                employee.getEmployeeName().isBlank()) {
            throw new IllegalArgumentException("Employee name cannot be empty.");
        }

        if (employee.getSalary() <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero.");
        }

        if (employeeDAO.getEmployeeById(employee.getEmployeeId()) != null) {
            throw new IllegalArgumentException("Employee ID already exists.");
        }

        employeeDAO.addEmployee(employee);

    }

    @Override
    public List<Employee> getAllEmployees() {

        return employeeDAO.getAllEmployees();

    }

    @Override
    public Employee getEmployeeById(int employeeId) {

        if (employeeId <= 0) {
            throw new IllegalArgumentException("Invalid employee ID.");
        }

        return employeeDAO.getEmployeeById(employeeId);

    }

    @Override
    public void updateSalary(int employeeId, double salary) {

        if (employeeId <= 0) {
            throw new IllegalArgumentException("Invalid employee ID.");
        }

        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero.");
        }

        if (employeeDAO.getEmployeeById(employeeId) == null) {
            throw new IllegalArgumentException("Employee not found.");
        }

        employeeDAO.updateSalary(employeeId, salary);

    }

    @Override
    public void deleteEmployee(int employeeId) {

        if (employeeId <= 0) {
            throw new IllegalArgumentException("Invalid employee ID.");
        }

        if (employeeDAO.getEmployeeById(employeeId) == null) {
            throw new IllegalArgumentException("Employee not found.");
        }

        employeeDAO.deleteEmployee(employeeId);

    }

}