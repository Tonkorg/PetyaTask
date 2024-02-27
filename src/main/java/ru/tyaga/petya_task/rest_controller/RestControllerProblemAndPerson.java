package ru.tyaga.petya_task.rest_controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tyaga.petya_task.domain.Person;
import ru.tyaga.petya_task.domain.Problem;
import ru.tyaga.petya_task.service.class_for_service.PersonService;
import ru.tyaga.petya_task.service.class_for_service.ProblemService;


import java.time.LocalDate;



@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class RestControllerProblemAndPerson {

    private final PersonService personService;
    private final ProblemService problemService;

    @PostMapping("/createFull")
    public ResponseEntity<String> processData(@RequestBody ProblemAndPerson problemAndPerson) {
        try {
            Person person = new Person();
            person.setName(problemAndPerson.getName());
            person.setLastName(problemAndPerson.getLastName());
            person.setMidName(problemAndPerson.getMidName());
            person.setDateBT(problemAndPerson.getDateBT());
            person.setMail(problemAndPerson.getMail());

            personService.addNewPerson(person);

            Problem problem = new Problem();
            problem.setPerson(person); // Устанавливаем объект Person в Problem
            problem.setDescription(problemAndPerson.getDescription());

            problemService.addNewProblem(problem);

            return ResponseEntity.ok("Data processed successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing data: " + e.getMessage());
        }
    }
}


@Data
class ProblemAndPerson
{

    private String name;
    private String lastName;
    private String midName;
    private LocalDate dateBT;
    private String mail;
    private String description;
}
