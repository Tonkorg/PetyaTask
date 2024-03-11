package ru.tyaga.petya_task.rest_controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.tyaga.petya_task.domain.Person;
import ru.tyaga.petya_task.domain.Problem;
import ru.tyaga.petya_task.service.class_for_service.PersonService;
import ru.tyaga.petya_task.service.class_for_service.ProblemService;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class RestControllerProblemAndPerson {

    private final PersonService personService;
    private final ProblemService problemService;

    @PostMapping("/createFull")
    public ResponseEntity<String> processData(@RequestBody ProblemAndPerson problemAndPerson) {
        try{
        Person person = personService.getPersonByMail(problemAndPerson.getMail());

        if (person == null) {
            // Создаем нового пользователя
            person = new Person();
            person.setName(problemAndPerson.getName());
            person.setLastName(problemAndPerson.getLastName());
            person.setMidName(problemAndPerson.getMidName());
            person.setDateBT(problemAndPerson.getDateBT());
            person.setMail(problemAndPerson.getMail());
            personService.addNewPerson(person);
        }

          return   createProblemByPerson(problemAndPerson);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing data: " + e.getMessage());
        }
    }
    @PostMapping("/createProblem/{email}")
    public ResponseEntity<String> createProblemByPerson(@RequestBody ProblemAndPerson problemAndPerson)
    {
        try{
            Person person = personService.getPersonByMail(problemAndPerson.getMail());

            // Создаем новую проблему и связываем ее с пользователем
            Problem problem = new Problem();
            problem.setDescription(problemAndPerson.getDescription());
            problemService.addNewProblem(problem);
            person.addProblem(problem);
            personService.updatePerson(person);

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

