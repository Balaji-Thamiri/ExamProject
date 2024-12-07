package com.klef.jfsd.exam;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private List<String> subjects;

    // Constructor
    public Employee(int id, String name, double salary, String department, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.subjects = subjects;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
