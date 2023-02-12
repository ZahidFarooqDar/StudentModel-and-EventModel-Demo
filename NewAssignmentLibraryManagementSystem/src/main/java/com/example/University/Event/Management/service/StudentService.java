package com.example.University.Event.Management.service;

import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository iStudentRepository;

    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }

    public Student findById(int id) {
        return iStudentRepository.findById(id).get();
    }

    public void addStudent(Student student) {
        iStudentRepository.save(student);
    }

    public void updateStudent(int id, Student newStudent) {
        Student student = iStudentRepository.findById(id).get();
        student.setStudent_id(newStudent.getStudent_id());
        student.setFirst_name(newStudent.getFirst_name());
        student.setLast_name(newStudent.getLast_name());
        student.setAge(newStudent.getAge());
        student.setDepartment(newStudent.getDepartment());
    }

    public void deleteStudent(int id) {
        iStudentRepository.deleteById(id);
    }
}
