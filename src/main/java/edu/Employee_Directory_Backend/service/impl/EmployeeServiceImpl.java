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
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        if (employeeRepository.existsByEmail(employee.getEmail())){
            throw new IllegalArgumentException("Email already exists");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee not found"));

        if (!existingEmployee.getEmail().equals(updatedEmployee.getEmail()) &&
                employeeRepository.existsByEmail(updatedEmployee.getEmail())){
            throw new IllegalArgumentException("Email already exists");
        }

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setEmail(updatedEmployee.getEmail());
        existingEmployee.setDepartment(updatedEmployee.getDepartment());

        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)){
            throw new IllegalArgumentException("Employee not found");
        }
        employeeRepository.deleteById(id);
    }
}