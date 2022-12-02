package com.computo.demo2.service;

import com.computo.demo2.model.entity.Person;
import com.computo.demo2.model.pojo.dto.PersonDTO;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAllPersons();
    Person persist(PersonDTO dto);
    void update(Person entity);
    Optional<Person> findById(int id);
    void delete(Person entity);
}
