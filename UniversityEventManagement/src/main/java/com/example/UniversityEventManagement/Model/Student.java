package com.example.UniversityEventManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Validated
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {
    @Id
    private Long studentId;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$")
    private String firstName;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$")
    private String lastName;

    @Min(18)
    @Max(25)
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;
}
