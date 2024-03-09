package ru.tyaga.petya_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tyaga.petya_task.domain.Person;
import ru.tyaga.petya_task.domain.Problem;

import java.util.List;

public interface ProblemRep extends JpaRepository<Problem,Long> {

    Problem getProblemByProblemId(Long id);

    void deleteByProblemId(Long id);



}
