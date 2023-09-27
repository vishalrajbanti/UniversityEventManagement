package com.example.UniversityEventManagement.Controller;

import com.example.UniversityEventManagement.Model.Department;
import com.example.UniversityEventManagement.Model.Student;
import com.example.UniversityEventManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

   // Add student

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

  //  Get all students
    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


  //  Get student by Id
    @GetMapping("student/id/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

// update student department
    @PutMapping("student/department/age/{age}/id/{id}")
    public String updateStudentByDepartment(@RequestParam Department department,@PathVariable int age,@PathVariable Long id ){
        return studentService.updateStudentByDepartment(department, age,id);
    }
    // delete student
    @DeleteMapping("student/id/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }
}
