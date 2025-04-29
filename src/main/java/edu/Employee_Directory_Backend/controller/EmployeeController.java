package edu.Employee_Directory_Backend.controller;

import edu.Employee_Directory_Backend.dto.EmployeeDto;
import edu.Employee_Directory_Backend.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get-all")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @PostMapping("/add")
    public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody EmployeeDto employee) {
        EmployeeDto createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeDto employeeDetails) {
        EmployeeDto updatedEmployee = employeeService.updateEmployee(id, employeeDetails);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}