package edu.Employee_Directory_Backend.dto;

import edu.Employee_Directory_Backend.enums.Department;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private Department department;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
