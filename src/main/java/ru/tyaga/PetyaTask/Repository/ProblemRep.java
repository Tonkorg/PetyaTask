package ru.tyaga.PetyaTask.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tyaga.PetyaTask.Entyties.Problems;

public interface ProblemRep extends JpaRepository<Problems,Integer> {

    void deleteByMail(String mail);

     Problems findByMail(String mail);
}
