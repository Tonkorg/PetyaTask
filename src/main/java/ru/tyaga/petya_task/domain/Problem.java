package ru.tyaga.petya_task.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
public class Problem {

    @Id
    @GeneratedValue
    private Integer problem_id;

    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;

    private Long personId;

    private LocalDate date;

    private String description;

    public LocalDate getDate() {
        return LocalDate.now();
    }
}
