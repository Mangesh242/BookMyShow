package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Movies {
    @Id
    private int id;
    private String name;
}
