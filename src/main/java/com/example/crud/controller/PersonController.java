package com.example.crud.controller;

import com.example.crud.model.Person;
import com.example.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/person/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/find/{id}")
    public Person find(@PathVariable Long id) {
        return personService.findById(id);
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        personService.delete(id);
    }
}
