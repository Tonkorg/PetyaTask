package ru.tyaga.PetyaTask.Service;

import ru.tyaga.PetyaTask.Entyties.Problems;

import java.util.List;

public interface ProlemSer {

   List<Problems> findAll();

   Problems addNewProblem(Problems problems);

   String deleteProblem(String mail);

   Problems updateProblem(Problems problems);

   Problems findProblem(String mail);


}
