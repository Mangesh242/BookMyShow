package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String genre;
     private String releaseYear;
     //Movie and Actor
    // 1 M No need to give cardanility
     private List<String> actors;

     private List<Language> languages;
}
