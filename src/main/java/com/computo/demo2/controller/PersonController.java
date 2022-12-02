package com.computo.demo2.controller;

import com.computo.demo2.model.entity.Person;
import com.computo.demo2.model.pojo.dto.PersonDTO;
import com.computo.demo2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping
    public ResponseEntity<?> findAllPersons(){
        return new ResponseEntity<>(personService.findAllPersons(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> persist(@RequestBody PersonDTO dto){
        Person entity = personService.persist(dto);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody PersonDTO dto){
        Optional<Person> entity = personService.findById(id);
        entity.get().setName(dto.getName());
        entity.get().setLastName(dto.getLastName());
        entity.get().setDocument(dto.getDocument());
        personService.update(entity.get());
        return new ResponseEntity<>(entity.get(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        Optional<Person> entity = personService.findById(id);
        personService.delete(entity.get());
        return new ResponseEntity<>(entity.get(),HttpStatus.OK);
    }
}