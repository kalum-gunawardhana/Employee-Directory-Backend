package edu.Employee_Directory_Backend.service.impl;

import edu.Employee_Directory_Backend.dto.EmployeeDto;
import edu.Employee_Directory_Backend.entity.EmployeeEntity;
import edu.Employee_Directory_Backend.repository.EmployeeRepository;
import edu.Employee_Directory_Backend.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> employees = employeeRepository.findAll();
        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employee) {
        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }

        EmployeeEntity employeeEntity = modelMapper.map(employee, EmployeeEntity.class);
        EmployeeEntity savedEmployee = employeeRepository.save(employeeEntity);
        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDetails) {
        EmployeeEntity existingEmployee = employeeRepository.findById(id)
                .orElseThrow();

        if (employeeRepository.existsByEmailAndIdNot(employeeDetails.getEmail(), id)) {
            throw new IllegalArgumentException("Email already exists");
        }

        modelMapper.map(employeeDetails, existingEmployee);
        EmployeeEntity updatedEmployee = employeeRepository.save(existingEmployee);
        return modelMapper.map(updatedEmployee, EmployeeDto.class);
    }

    @Override
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            return;
        }
        employeeRepository.deleteById(id);
    }
}