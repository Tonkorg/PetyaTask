package ru.tyaga.petya_task.service.interface_of_service;

import ru.tyaga.petya_task.domain.Problem;

import java.util.List;

public interface ProblemSer {

   List<Problem> getAllProblem();

   Problem getProblemById(Long id);

   Problem updateProblem(Problem problem);

   String deleteProblemById(Long id);

   void addNewProblem(Problem problem);

   List<Problem>  getAllProblemByPersonId(Long personId);

}
