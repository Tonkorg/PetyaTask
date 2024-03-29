package ru.tyaga.petya_task.service.interface_of_service;

import ru.tyaga.petya_task.domain.Person;

import java.util.List;

public interface PersonSer {

    List<Person> getAllPerson();

    void addNewPerson(Person person);

    void updatePerson(Person person);

    void deletePersonByMail(String mail);

    Person getPersonById(Long id);
    Person getPersonByMail (String mail);
}
