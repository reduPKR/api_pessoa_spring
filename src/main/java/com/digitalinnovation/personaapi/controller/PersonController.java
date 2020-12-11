package com.digitalinnovation.personaapi.controller;

import com.digitalinnovation.personaapi.dto.entity.PersonDTO;
import com.digitalinnovation.personaapi.dto.response.MessageResponseDTO;
import com.digitalinnovation.personaapi.exception.PersonNotFoundException;
import com.digitalinnovation.personaapi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> getAll(){
        return personService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PersonDTO getById(@PathVariable long id) throws PersonNotFoundException {
        return personService.getById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable long id) throws PersonNotFoundException {
        personService.delete(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO update(@PathVariable long id, @RequestBody PersonDTO personDTO) throws PersonNotFoundException {
        return personService.update(id, personDTO);
    }
}
