package edu.Employee_Directory_Backend.service.impl;

import edu.Employee_Directory_Backend.entity.Employee;
import edu.Employee_Directory_Backend.repository.EmployeeRepository;
import edu.Employee_Directory_Backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}