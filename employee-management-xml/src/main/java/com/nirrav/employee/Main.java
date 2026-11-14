package com.nirrav.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nirrav.employee.facade.EmployeeFacade;
import com.nirrav.employee.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
			EmployeeFacade employeeFacade= context.getBean("employeeFacade", EmployeeFacade.class);
			
			System.out.println("========================================");
            System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("========================================");
            
            Employee emp1 = new Employee(101, "Nirrav", "IT", 45000);
            Employee emp2 = new Employee(102, "Anaya", "Finance", 50000);

            System.out.println("101, Nirrav, IT, 45000");
            employeeFacade.addEmployee(emp1);
            
            System.out.println("\n102, Anaya, Finance, 50000");
            employeeFacade.addEmployee(emp2);
            
            System.out.println("\nAll Employees: ");
            
            for(Employee employee: employeeFacade.getAllEmployees()) {
            	employee.displayEmployee();
            	System.out.println("---------------------");
            }
            
            System.out.println("\nUpdating Nirrav's salary: ");
            employeeFacade.updateSalary(101, 45001);
            
            Employee updatedEmployee = employeeFacade.getEmployeeById(101);
            
            updatedEmployee.displayEmployee();
		}
	}

}
