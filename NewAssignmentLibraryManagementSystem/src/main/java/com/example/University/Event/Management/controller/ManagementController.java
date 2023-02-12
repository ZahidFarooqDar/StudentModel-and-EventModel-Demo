package com.example.University.Event.Management.controller;

import com.example.University.Event.Management.model.EventManagement;
import com.example.University.Event.Management.model.Student;
import com.example.University.Event.Management.service.EventService;
import com.example.University.Event.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/university-event")
public class ManagementController {
    @Autowired
    private EventService eventService;
    @Autowired
    private StudentService studentService;


    /* ------------------------------STUDENT MAPPING ---------------------------------- */

    @GetMapping("get-all-students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("get-all-students-by-id/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @PostMapping("add-student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("update-student")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("delete-student")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    /* ----------------------------EVENT MAPPING--------------------------------------- */
    @GetMapping("getAllEvent")
    public List<EventManagement> findAllEvent() {
        return eventService.findAllEvent();
    }

    @GetMapping("get-event-date/{date}")
    public List<EventManagement> findByDate(@PathVariable String date) {
        return eventService.findByDate(date);
    }

    @PostMapping("add-event")
    public void addEvent(@RequestBody EventManagement eventManagement) {
        eventService.addEvent(eventManagement);
    }

    @PutMapping("update-event/{id}")
    public void updateEvent(@PathVariable int id, @RequestBody EventManagement eventManagement) {
        eventService.updateEvent(id, eventManagement);
    }

    @DeleteMapping("delete-event/{id}")
    public void deleteEvent(@PathVariable int id) {
        eventService.deleteEvent(id);
    }
}
