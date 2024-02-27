package ru.tyaga.petya_task.service.class_for_service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import ru.tyaga.petya_task.domain.Person;
import ru.tyaga.petya_task.repository.PersonRep;
import ru.tyaga.petya_task.service.interface_of_service.PersonSer;

import java.util.List;


@Service
@AllArgsConstructor
public class PersonService implements PersonSer {

     private PersonRep personRep;

    @Override
    public List<Person> getAllPerson() {
        return personRep.findAll();
    }

    @Override
    public void addNewPerson(Person person) {
        personRep.save(person);
    }

    @Override
    public void updatePerson(Person person) {
        personRep.save(person);
    }

    @Override
    public void deletePersonByMail(String mail) {

        personRep.deletePersonByMail(mail);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRep.getPersonById(id);
    }


}
