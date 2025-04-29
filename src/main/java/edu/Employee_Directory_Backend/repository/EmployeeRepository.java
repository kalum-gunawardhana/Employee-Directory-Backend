package edu.Employee_Directory_Backend.repository;

import edu.Employee_Directory_Backend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long id);
    List<EmployeeEntity> findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String query, String query1);
}
