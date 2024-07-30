package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private String amount;
    private String refNumber;
    private Date paymentDate;
    private PaymentGateway paymentGateway;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    @ManyToOne
    private Booking booking;
}
