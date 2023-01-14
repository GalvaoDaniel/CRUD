package com.example.crud.controller;

import com.example.crud.model.Person;
import com.example.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Person person) {
        personService.delete(person);
    }
}