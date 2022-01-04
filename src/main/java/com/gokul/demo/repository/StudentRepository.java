package com.gokul.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokul.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
