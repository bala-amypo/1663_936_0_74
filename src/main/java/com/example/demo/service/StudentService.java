package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.sterotype.Service;
import com.example.demo.Service.StudentService;


public interface StudentService{
    @Autowired StudentRepo student;
    // save()
    // findall()
    // findById()
    // deleteById()
    // existsById()

    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu); 

    }
}