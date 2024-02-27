package ru.tyaga.petya_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tyaga.petya_task.domain.Person;

public interface PersonRep extends JpaRepository {

    void deletePersonByMail(String mail);

    Person getPersonById(Long id);
}
