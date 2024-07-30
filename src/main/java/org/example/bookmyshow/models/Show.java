package org.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    //Show and movie
    //M 1
    @ManyToOne
    private Movie movie;

    private Date startTime;
    private int duration;
    //Show and Screen
    //1 M
    @OneToMany
    private List<Screen> screen;
    //Show and ShowSeat
    //M : M
    @OneToMany
    private List<ShowSeat> showSeats;

    //Show and showseatType
    @OneToMany
    private List<ShowSeatType> showSeatTypes;
}
