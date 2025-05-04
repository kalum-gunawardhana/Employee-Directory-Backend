package edu.Employee_Directory_Backend.service;

import edu.Employee_Directory_Backend.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee updatedEmployee);
    void deleteEmployee(Long id);
}