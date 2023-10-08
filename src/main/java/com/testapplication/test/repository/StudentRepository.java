package com.testapplication.test.repository;

import com.testapplication.test.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
