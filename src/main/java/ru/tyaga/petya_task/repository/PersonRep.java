package ru.tyaga.petya_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tyaga.petya_task.domain.Person;

@Repository
public interface PersonRep extends JpaRepository<Person, Long> {

    void deletePersonByMail(String mail);

    Person getPersonByPersonID(Long id);
}
