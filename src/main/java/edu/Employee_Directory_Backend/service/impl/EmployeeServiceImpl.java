package edu.Employee_Directory_Backend.service.impl;

import edu.Employee_Directory_Backend.dto.EmployeeDto;
import edu.Employee_Directory_Backend.repository.EmployeeRepository;
import edu.Employee_Directory_Backend.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return List.of();
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employee) {
        return null;
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDetails) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public List<EmployeeDto> searchEmployees(String query) {
        return List.of();
    }
}
