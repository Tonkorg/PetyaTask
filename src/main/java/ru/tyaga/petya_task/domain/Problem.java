package ru.tyaga.petya_task.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Problem {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id")
    private Person person;

    private Long personId;

    private LocalDate date;

    private String description;



}
