package org.example.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public class Region extends BaseModel{
    private String name;
    //No need to keep all the theater within region

}
