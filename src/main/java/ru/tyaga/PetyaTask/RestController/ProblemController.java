package ru.tyaga.PetyaTask.RestController;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tyaga.PetyaTask.Entyties.Problems;
import ru.tyaga.PetyaTask.Service.ProblemService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ProblemController {

    private ProblemService problemService;


    @GetMapping("/getProblems")
     public List<Problems> findAll()
    {
        return  problemService.findAll();
    }

    @PostMapping("/addProblem")
    public String addNewProblem(@RequestBody Problems problems) {
        problemService.addNewProblem(problems);
        return "Success";
    }

    @DeleteMapping("/deleteProblem/{mail}")
    public String deleteProblem(@PathVariable String mail) {
        return problemService.deleteProblem(mail);
    }


    @PutMapping("/updateProblem")
    public Problems updateProblem(@RequestBody Problems problems) {

        return problemService.updateProblem(problems);
    }

    @GetMapping("/getProblem/{mail}")
    public Problems findProblem(@PathVariable String mail) {

        return  problemService.findProblem(mail);
    }

}
