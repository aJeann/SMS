package com.example.sms.service;

import com.example.sms.entity.Student;

import java.util.List;

/**
 * Created by Axel Jeansson
 * Date: 2021-08-30
 * Time: 18:02
 * Project: SMS
 * Copyright: MIT
 */
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudent(Long id);
}
