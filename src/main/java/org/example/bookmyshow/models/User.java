package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity // This tells Hibernate to make a table out of this class
public class User extends  BaseModel{

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String emial;

    private List<Booking> bookings;


}