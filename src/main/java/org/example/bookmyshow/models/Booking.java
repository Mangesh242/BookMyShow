package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    //Booking and showSeat
    //1 M
    @OneToMany
    private List<ShowSeat> showSeat;

    private int amount;
    //Booking and payments
    //1 M
    @OneToMany
    private List<Payment> payments;
    //Booking M  1 User
    @ManyToOne
    private User bookedBy;
    private Date bookingDate;
    private BookingStatus bookingStatus;

}
//Map all the require classes to entity
