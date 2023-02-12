package com.example.university.studentmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int StudentId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
}

