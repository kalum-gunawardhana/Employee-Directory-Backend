package edu.Employee_Directory_Backend.service.impl;

import edu.Employee_Directory_Backend.entity.EmployeeEntity;
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
    public List<EmployeeEntity> getAllEmployees() {
        return null;
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return null;
    }

    @Override
    public EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeDetails) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        return;
    }

    @Override
    public List<EmployeeEntity> searchEmployees(String query) {
        return null;
    }
}
