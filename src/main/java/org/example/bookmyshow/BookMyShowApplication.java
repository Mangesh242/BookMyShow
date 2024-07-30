package org.example.bookmyshow;

import lombok.ToString;
import org.example.bookmyshow.models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookMyShowApplication {

    public static void main(String[] args) {

        BaseModel md=new BaseModel();
        md.setId(1);
        SpringApplication.run(BookMyShowApplication.class, args);
    }

}
