package ru.tyaga.petya_task.rest_controller;

//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//import ru.tyaga.petya_task.domain.Problem;
//import ru.tyaga.petya_task.service.class_for_service.ProblemService;
//
//import java.util.List;

//@RestController
//@AllArgsConstructor
//@RequestMapping("/api/v1")
//public class ProblemController {
//
//    private ProblemService problemService;
//
//
//    @GetMapping("/getProblems")
//     public List<Problem> findAll()
//    {
//        return  problemService.findAll();
//    }
//
//    @PostMapping("/addProblem")
//    public String addNewProblem(@RequestBody Problem problem) {
//        problemService.addNewProblem(problem);
//        return "Success";
//    }
//
//    @DeleteMapping("/deleteProblem/{mail}")
//    public String deleteProblem(@PathVariable String mail) {
//        return problemService.deleteProblem(mail);
//    }
//
//
//    @PutMapping("/updateProblem")
//    public Problem updateProblem(@RequestBody Problem problem) {
//
//        return problemService.updateProblem(problem);
//    }
//
//    @GetMapping("/getProblem/{mail}")
//    public Problem findProblem(@PathVariable String mail) {
//
//        return  problemService.findProblem(mail);
//    }
//
//}
