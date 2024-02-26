package ru.tyaga.PetyaTask.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tyaga.PetyaTask.Entyties.Problems;
import ru.tyaga.PetyaTask.Repository.ProblemRep;

import java.util.List;

@Service
@AllArgsConstructor
public class ProblemService implements ProlemSer {

    private final ProblemRep problemRep;


    @Override
    public List<Problems> findAll() {
        return problemRep.findAll();
    }

    @Override
    public Problems addNewProblem(Problems problems) {
        return problemRep.save(problems);
    }

    @Override
    @Transactional
    public String deleteProblem(String mail) {
         problemRep.deleteByMail(mail);
        return "OK";
    }

    @Override
    public Problems updateProblem(Problems problems) {
        return problemRep.save(problems);
    }

    @Override
    public Problems findProblem(String mail) {
        return problemRep.findByMail(mail);
    }


}
