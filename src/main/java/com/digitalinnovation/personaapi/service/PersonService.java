package com.digitalinnovation.personaapi.service;

import com.digitalinnovation.personaapi.dto.entity.PersonDTO;
import com.digitalinnovation.personaapi.dto.response.MessageResponseDTO;
import com.digitalinnovation.personaapi.entity.Person;
import com.digitalinnovation.personaapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person new_person = personRepository.save(personDTO);
        return MessageResponseDTO.builder()
                .message("Criado")
                .build();
    }
}
