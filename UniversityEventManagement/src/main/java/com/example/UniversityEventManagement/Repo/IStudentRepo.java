package com.example.UniversityEventManagement.Repo;

import com.example.UniversityEventManagement.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
