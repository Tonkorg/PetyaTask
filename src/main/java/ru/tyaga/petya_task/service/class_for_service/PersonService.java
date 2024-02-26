package ru.tyaga.petya_task.service.class_for_service;

import ru.tyaga.petya_task.domain.Person;
import ru.tyaga.petya_task.service.interface_of_service.PersonSer;

import java.util.List;

public class PersonService implements PersonSer {


    @Override
    public List<Person> getAllPerson() {
        return null;
    }

    @Override
    public void addNewPerson(Person person) {

    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePersonByMail(String mail) {

    }
}
