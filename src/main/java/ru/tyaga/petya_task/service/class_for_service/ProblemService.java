package ru.tyaga.petya_task.service.class_for_service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tyaga.petya_task.domain.Problem;
import ru.tyaga.petya_task.repository.ProblemRep;
import ru.tyaga.petya_task.service.interface_of_service.ProblemSer;

import java.util.List;

//@Service
//@AllArgsConstructor
//public class ProblemService implements ProblemSer {
//
//    private final ProblemRep problemRep;
//
//
//    @Override
//    public List<Problem> findAll() {
//        return problemRep.findAll();
//    }
//
//    @Override
//    public Problem addNewProblem(Problem problem) {
//        return problemRep.save(problem);
//    }
//
//    @Override
//    @Transactional
//    public String deleteProblem(String mail) {
//         problemRep.deleteByMail(mail);
//        return "OK";
//    }
//
//    @Override
//    public Problem updateProblem(Problem problem) {
//        return problemRep.save(problem);
//    }
//
//    @Override
//    public Problem findProblem(String mail) {
//        return problemRep.findByMail(mail);
//    }
//}
