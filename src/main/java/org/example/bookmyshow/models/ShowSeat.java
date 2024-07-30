package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private ShowSeat show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
