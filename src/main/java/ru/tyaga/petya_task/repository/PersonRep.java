package ru.tyaga.petya_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRep extends JpaRepository {

    void deletePersonByMail(String mail);
}
