package com.project1;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeePerformanceAnalysis {
	public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sahithi", 8, 50000),
                new Employee("Sanjana", 9, 55000),
                new Employee("Arjun", 7, 48000),
                new Employee("Hema", 6, 47000),
                new Employee("Venni", 9, 62000)
        );

        // Filtering employees with performance rating >= 8
        List<Employee> highPerformers = employees.stream()
                .filter(e -> e.getPerformanceRating() >= 8)
                .collect(Collectors.toList());

        System.out.println("High Performers:");
        highPerformers.forEach(System.out::println);

        // Sorting employees by performance rating and then by salary
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getPerformanceRating)
                        .thenComparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("\nSorted Employees by Performance and Salary:");
        sortedEmployees.forEach(System.out::println);

        // Average performance rating of all employees
        double avgPerformance = employees.stream()
                .mapToInt(Employee::getPerformanceRating)
                .average()
                .orElse(0);

        System.out.println("\nAverage Performance Rating: " + avgPerformance);
    }

}
