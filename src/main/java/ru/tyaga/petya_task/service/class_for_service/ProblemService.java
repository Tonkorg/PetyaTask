package ru.tyaga.petya_task.service.class_for_service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tyaga.petya_task.domain.Person;
import ru.tyaga.petya_task.domain.Problem;
import ru.tyaga.petya_task.repository.ProblemRep;
import ru.tyaga.petya_task.service.interface_of_service.ProblemSer;

import java.util.List;

@Service
@AllArgsConstructor

public class ProblemService implements ProblemSer {

    private ProblemRep problemRep;

    @Override
    public List<Problem> getAllProblem() {
        return problemRep.findAll();
    }

    @Override
    public Problem getProblemById(Long id) {
        return problemRep.getProblemByProblemId(id);
    }

    @Override
    public Problem updateProblem(Problem problem) {
        return problemRep.save(problem);
    }

    @Override
    public String deleteProblemById(Long id) {
         problemRep.deleteById(id);
         return "success";
    }

    @Override
    public void addNewProblem(Problem problem) {

        problemRep.save(problem);
    }

    @Override
    public List<Problem> getAllProblemByPerson(Person person) {
        return problemRep.getAllByPerson(person);
    }



}

