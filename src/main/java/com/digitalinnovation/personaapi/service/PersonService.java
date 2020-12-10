package com.digitalinnovation.personaapi.service;

import com.digitalinnovation.personaapi.dto.entity.PersonDTO;
import com.digitalinnovation.personaapi.dto.response.MessageResponseDTO;
import com.digitalinnovation.personaapi.entity.Person;
import com.digitalinnovation.personaapi.exception.PersonNotFoundException;
import com.digitalinnovation.personaapi.mapping.PersonMapper;
import com.digitalinnovation.personaapi.repository.PersonRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person person = personMapper.toModel(personDTO);
        Person new_person = personRepository.save(person);
        return MessageResponseDTO.builder()
                .message("Usuario cadastrado seu id é: "+new_person.getId())
                .build();
    }

    public List<PersonDTO> getAll() {
        List<Person> people = personRepository.findAll();
        return people.stream()
                .map(personMapper::toModel)
                .collect(Collectors.toList());
    }

    public PersonDTO getById(long id) throws PersonNotFoundException {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));

//        if(optional.isPresent())
//            throw new PersonNotFoundException(id);

        return personMapper.toModel(person);
    }
}
