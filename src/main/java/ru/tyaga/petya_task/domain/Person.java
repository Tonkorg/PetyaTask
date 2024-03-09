package ru.tyaga.petya_task.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.time.LocalDate;
import java.time.Period;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long personID;

    @OneToMany()
    @JoinColumn(name = "personID")
    @Cascade(CascadeType.ALL)
    List<Problem> problems = new ArrayList<>();



    private String name;
    private String lastName;
    private String midName;
    private LocalDate dateBT;

    @Column(unique = true)
    private String mail;

    @Transient
    private int age;

    public int getAge() {
        return Period.between(dateBT, LocalDate.now()).getYears();
    }

    public List<Problem> getProblems() {
        return problems;
    }

    public void addProblem(Problem problem)
    {
        problems.add(problem);
    }


    public void removePromlem(Problem problem)
    {
        problems.remove(problem);
    }
}