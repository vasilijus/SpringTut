package com.sergej.springtut.api;

import com.sergej.springtut.model.Person;
import com.sergej.springtut.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person") // POST Request
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController( PersonService personService ){
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping // GET Request
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }
}
