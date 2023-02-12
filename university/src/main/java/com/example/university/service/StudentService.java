package com.example.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.university.studentmodel.Student;

@Service
public class StudentService {
    private static List<Student> students = new ArrayList<>();
    static{
        students.add(new Student(1,"Zahid","Dar",24,"CSE"));
        students.add(new Student(2,"Aamir","Mir",23,"CSE"));
        students.add(new Student(3,"Asrar","Qadri",22,"CSE"));
        students.add(new Student(4,"Shazia","Akther",18,"CSE"));
    }

    public List<Student> getAll(){
        return students;
    }
    public Student findById(int id){
        return students.stream().filter(t-> t.getStudentId()==id).findFirst().get();

    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int studentId, Student newStudent) {

        Student student = findById(studentId);
        student.setDepartment(newStudent.getDepartment());
    }
    public void deleteStudent(int id){
        Student s = findById(id);
        students.remove(s);
    }

}