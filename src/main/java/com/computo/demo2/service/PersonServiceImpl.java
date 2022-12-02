package com.computo.demo2.service;

import com.computo.demo2.model.entity.Person;
import com.computo.demo2.model.pojo.dto.PersonDTO;
import com.computo.demo2.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }
    @Override
    public Person persist(PersonDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setLastName(dto.getLastName());
        entity.setDocument(dto.getDocument());
        personRepository.save(entity);
        return entity;
    }

    @Override
    public void update(Person entity) {
        personRepository.save(entity);
    }

    @Override
    public Optional<Person> findById(int id) {
        Optional<Person> entity = personRepository.findById(id);
        return entity;
    }

    @Override
    public void delete(Person entity) {
        personRepository.delete(entity);
    }
}
