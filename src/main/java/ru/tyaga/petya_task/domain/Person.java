package ru.tyaga.petya_task.domain;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

@Data
@Entity
public class Person {

    @OneToMany(mappedBy="personId")
    @Cascade(CascadeType.ALL)
    Set<Problem> problems;

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String lastName;
    private String midName;
    private LocalDate dateBT;

    @Column(unique = true)
    private String mail;

    @Transient
    private int age;

    public int getAge() {
        return Period.between(dateBT,LocalDate.now()).getYears();
    }
}
