package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;
    //private List<Screen> list;
    //User does not selects screens


    private Region region;
}

//Cardanility Region and Theater
//              1    M
//So we need to store region id into theater table
//Select * from theatre where region_id=5;
//Base on the show, screen is automatically selected : Admin must have info