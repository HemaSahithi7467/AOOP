package com.project1;

public class Employee {
	
	private String name;
    private int performanceRating; // Rating out of 10
    private double salary;

    public Employee(String name, int performanceRating, double salary) {
        this.name = name;
        this.performanceRating = performanceRating;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', performanceRating=" + performanceRating + ", salary=" + salary + '}';
    }
}


