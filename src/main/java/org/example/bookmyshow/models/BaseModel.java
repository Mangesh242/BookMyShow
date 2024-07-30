package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@Entity
@MappedSuperclass
public class BaseModel {
    @Id
    private int id;
    private Date createdAt;
    private Date updatedAt;
}
//Corresponding tables will be created which will persist the Data
//Do certain business logic
//Creating certain object :
//Two things we want : get the data and put those into object
//put the object into data. conversion of data to object and vice versa
//ORM : Object Relation Mapping
// Hibernate : Focus on the implementation of certain methods which internally uses sql queries
//and get your work done of object relational mapping.

//Sprint Data JPA (interface library) : Agent between DB and JPA
//JPA interface to all relational db for hibernate.
//JPA is with proper methods and contract, loose coupling
// Hibernate implements all the methods of JPA.

//SPRING_DATA_JPA inself includes hibernate

//For ORM gets to know I need to create table out of it
//Entity Annotation