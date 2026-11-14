package com.nirrav.employee.service;

import java.util.List;

import com.nirrav.employee.bo.EmployeeBO;
import com.nirrav.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeBO employeeBO;

    public EmployeeServiceImpl(EmployeeBO employeeBO) {
        this.employeeBO = employeeBO;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeBO.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeBO.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeBO.getEmployeeById(employeeId);
    }

    @Override
    public void updateSalary(int employeeId, double salary) {
        employeeBO.updateSalary(employeeId, salary);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeeBO.deleteEmployee(employeeId);
    }

}