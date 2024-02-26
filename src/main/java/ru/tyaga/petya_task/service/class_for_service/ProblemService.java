package ru.tyaga.petya_task.service.class_for_service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tyaga.petya_task.domain.Problem;
import ru.tyaga.petya_task.repository.ProblemRep;
import ru.tyaga.petya_task.service.interface_of_service.ProblemSer;

import java.util.List;

@Service
@AllArgsConstructor
public class ProblemService implements ProblemSer {
    @Override
    public List<Problem> getAllProblem() {
        return null;
    }

    @Override
    public Problem getProblemById(Long id) {
        return null;
    }

    @Override
    public Problem updateProblem(Problem problem) {
        return null;
    }

    @Override
    public String deleteProblemById(Long id) {
        return null;
    }

    @Override
    public void addNewProblem(Problem problem) {

    }
}

