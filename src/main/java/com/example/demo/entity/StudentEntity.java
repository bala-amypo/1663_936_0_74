package com.example.demo.entity


import jarkarta.persistence.Entity;
import jarkarta.persistence.Id;

@Entity
public class StudentEntity(){
    @Id
     private integer id;
     private String name;
     private String email;
     private String password;
     private Date created;


     public void setId(Integer id){
        this.id=id;
     }

     public Integer getId(){
        return id;
     }

     public void setCreated(Date created){
        this.created=created;
     }

     public Date getCreated(){
        return created;
     }

     public void setName(String name){
        this.name=name;
     }

     public String getName(){
        return name;
     }

     public void setEmail(String email){
        this.email=email;
     }

     public String getEmail(){
        return email;
     }

     public void setPassword(String password){
        this.password=password;
     }

     public String getPassword(){
        return password;
     }

     public StudentEntity(Integer id,String name,String email, String password,Date created){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.created= created;
     }

     public StudentEntity(){

     }

}               