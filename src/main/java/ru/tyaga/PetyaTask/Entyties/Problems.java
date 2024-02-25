package ru.tyaga.PetyaTask.Entyties;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
public class Problems {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String lastName;
    private String midName;
    private LocalDate dateBT;

    @Transient
    private int age;

    @Column(unique = true)
    private String mail;

    private String description;

    public int getAge() {
        return Period.between(dateBT,LocalDate.now()).getYears();
    }
}
