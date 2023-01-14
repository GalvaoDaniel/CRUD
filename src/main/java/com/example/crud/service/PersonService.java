package com.example.crud.service;

import com.example.crud.model.Person;
import com.example.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person update(Person person) {
        return personRepository.save(person);
    }

    public void delete(Person person) {
        personRepository.delete(person);
    }
}
