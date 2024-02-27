package ru.tyaga.petya_task.rest_controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tyaga.petya_task.domain.Person;
import ru.tyaga.petya_task.service.class_for_service.PersonService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/person")
public class PersonController {

    private PersonService personService;

    @GetMapping("/getAllPerson")
    public List<Person> getAllPerson()
    {
        return personService.getAllPerson();
    }

    @PostMapping("/addNewPerson")
    public String addNewPerson(@RequestBody Person person)
    {
        personService.addNewPerson(person);
        return "Ok";
    }

    @PutMapping("/updatePerson")
    public void updatePerson(@RequestBody Person person)
    {
         personService.updatePerson(person);
    }

    @DeleteMapping("/deletePerson/{mail}")
    public String deletePerson(@PathVariable String mail)
    {
        personService.deletePersonByMail(mail);
        return "Ok";
    }

    @GetMapping("/getPerson/{id}")
    Person getPersonById(@PathVariable Long id)
    {
        return personService.getPersonById(id);
    }
}
