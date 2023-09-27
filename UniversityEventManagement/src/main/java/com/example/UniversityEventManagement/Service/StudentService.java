package com.example.UniversityEventManagement.Service;

import com.example.UniversityEventManagement.Model.Department;
import com.example.UniversityEventManagement.Model.Student;
import com.example.UniversityEventManagement.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudent(Student student) {
        iStudentRepo.save(student);
        return "added";
    }

    public List<Student> getStudents() {
        return iStudentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return iStudentRepo.findById(id).get();
    }

    public String updateStudentByDepartment(Department department, int age ,Long id) {
     Student student  = iStudentRepo.findById(id).get();
     student.setDepartment(department);
     student.setAge(age);
     return "updated";
    }

    public String deleteStudent(Long id) {
        iStudentRepo.deleteById(id);
        return "deleted";
    }
}
