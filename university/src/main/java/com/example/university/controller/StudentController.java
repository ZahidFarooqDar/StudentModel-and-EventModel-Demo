package com.example.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.service.StudentService;
import com.example.university.studentmodel.Student;

@RestController
@RequestMapping("/api/Students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/Get-all-students")
    public List<Student> getAll(){
        return studentService.getAll();
    }
    @GetMapping("Get-student-by-Id/StudentId/{id}")
    public Student findByID(@PathVariable int id){
        return studentService.findById(id);
    }
    @PostMapping("Add-student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @PutMapping("update/StudentById/{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student){
        studentService.updateStudent(studentId,student);
    }
    @DeleteMapping("delete-student/StudentId/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }




}