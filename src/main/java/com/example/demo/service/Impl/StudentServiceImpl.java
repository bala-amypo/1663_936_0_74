package com.example.demo.service.Impl;

import com.example.demo.repository.StudentRepo;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepo student;


    // save()
    // findall()
    // findById()
    // deleteById()
    // existsById()

    @Override
    public StudentEntity postdata(StudentEntity stu){
        return student.save(stu);  

    }
}

