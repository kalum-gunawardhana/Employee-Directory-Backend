package edu.Employee_Directory_Backend.repository;

import edu.Employee_Directory_Backend.entity.EmployeeEntity;
import edu.Employee_Directory_Backend.enums.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long id);
    List<EmployeeEntity> findByNameContainingIgnoreCase(String name);
    List<EmployeeEntity> findByEmailContainingIgnoreCase(String email);
    List<EmployeeEntity> findByDepartment(Department department);
}