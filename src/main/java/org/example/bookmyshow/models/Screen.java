package org.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Screen extends BaseModel{
    private String name;
    //Scree and Seats
    // 1 M
    @OneToMany
    private List<Seat> seats;
    //Screen and Theater
    // 1 1
    @OneToOne
    private Theatre theatre;
    //Screen and Features
    // 1  M
    //M 1

    @ElementCollection
    private List<Feature> features;

}
