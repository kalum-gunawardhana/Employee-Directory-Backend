package edu.Employee_Directory_Backend.service;

import edu.Employee_Directory_Backend.entity.EmployeeEntity;
import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity createEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeDetails);
    void deleteEmployee(Long id);
    List<EmployeeEntity> searchEmployees(String query);
}
