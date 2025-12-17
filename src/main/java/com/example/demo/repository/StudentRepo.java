package com.example.demo.repository;

import org.springframework.sterotype.Repository

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

    
}