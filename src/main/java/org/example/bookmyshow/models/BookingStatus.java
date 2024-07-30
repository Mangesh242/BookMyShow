package org.example.bookmyshow.models;

import jakarta.persistence.Entity;


public enum BookingStatus {
    PENDING,
    CANCEL,
    SUCCESSFUL,
    FAILED
}
