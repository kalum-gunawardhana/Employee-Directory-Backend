package edu.Employee_Directory_Backend.repository;

import edu.Employee_Directory_Backend.entity.Employee;
import edu.Employee_Directory_Backend.enums.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}