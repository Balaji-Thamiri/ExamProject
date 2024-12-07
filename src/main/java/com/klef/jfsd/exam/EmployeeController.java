package com.klef.jfsd.exam;

public class EmployeeController {
    private Employee employee;

    // Getter
    public Employee getEmployee() {
        return employee;
    }

    // Setter
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Optional: Add a method to demonstrate functionality
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Department: " + employee.getDepartment());
        System.out.println("Employee Subjects: " + employee.getSubjects());
    }
}
