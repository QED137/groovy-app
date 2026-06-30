package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public List<Employee> sortBySalaryDesc(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }

    public List<Employee> filterByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    public double averageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }
}