package com.digitalinnovation.personaapi.controller;

import com.digitalinnovation.personaapi.dto.response.MessageResponseDTO;
import com.digitalinnovation.personaapi.entity.Person;
import com.digitalinnovation.personaapi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}
