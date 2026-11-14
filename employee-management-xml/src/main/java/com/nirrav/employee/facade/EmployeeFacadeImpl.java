package com.nirrav.employee.facade;

import java.util.List;

import com.nirrav.employee.model.Employee;
import com.nirrav.employee.service.EmployeeService;

public class EmployeeFacadeImpl implements EmployeeFacade {

    private final EmployeeService employeeService;

    public EmployeeFacadeImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @Override
    public void updateSalary(int employeeId, double salary) {
        employeeService.updateSalary(employeeId, salary);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

}