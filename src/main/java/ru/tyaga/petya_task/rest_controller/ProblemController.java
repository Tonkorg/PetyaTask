package ru.tyaga.petya_task.rest_controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tyaga.petya_task.domain.Problem;
import ru.tyaga.petya_task.service.class_for_service.PersonService;
import ru.tyaga.petya_task.service.class_for_service.ProblemService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/problem")
public class ProblemController {

    private ProblemService problemService;



    @GetMapping("/getProblems")
     public List<Problem> findAll()
    {
        return  problemService.getAllProblem();
    }

    @PostMapping("/addProblem")
    public String addNewProblem(@RequestBody Problem problem) {
        problemService.addNewProblem(problem);
        return "Success";
    }

    @PutMapping("/updateProblem")
    public Problem updateProblem(@RequestBody Problem problem) {

        return problemService.updateProblem(problem);
    }


    @GetMapping("/getProblem/{id}")
    public Problem findProblem(@PathVariable Long id) {

        return  problemService.getProblemById(id);
    }

    @GetMapping("/getProblemForPerson/{personId}")
    List<Problem> getAllProblemByPersonId(@PathVariable Long personId)
    {
        return problemService.getAllProblemByPersonId(personId);
    }


}
