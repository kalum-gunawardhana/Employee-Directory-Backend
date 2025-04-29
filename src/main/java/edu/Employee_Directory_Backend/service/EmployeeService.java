package edu.Employee_Directory_Backend.service;

import edu.Employee_Directory_Backend.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();
    EmployeeDto createEmployee(EmployeeDto employee);
    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDetails);
    void deleteEmployee(Long id);
}