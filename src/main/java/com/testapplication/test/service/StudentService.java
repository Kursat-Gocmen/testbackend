package com.testapplication.test.service;

import com.testapplication.test.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> GetAllStudents();
}
