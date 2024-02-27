package ru.tyaga.petya_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tyaga.petya_task.domain.Problem;

import java.util.List;

public interface ProblemRep extends JpaRepository<Problem,Integer> {

    Problem getProblemById(Long id);

    void deleteById(Long id);


    List<Problem> getAllByPersonId(Long personId);
}
