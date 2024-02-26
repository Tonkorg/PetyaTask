package ru.tyaga.petya_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tyaga.petya_task.domain.Problem;

public interface ProblemRep extends JpaRepository<Problem,Integer> {

    void deleteByMail(String mail);

     Problem findByMail(String mail);
}
