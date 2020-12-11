package com.digitalinnovation.personaapi.service;

import com.digitalinnovation.personaapi.dto.entity.PersonDTO;
import com.digitalinnovation.personaapi.dto.response.MessageResponseDTO;
import com.digitalinnovation.personaapi.entity.Person;
import com.digitalinnovation.personaapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.digitalinnovation.personaapi.utils.PersonUtils.createFakeDTO;
import static com.digitalinnovation.personaapi.utils.PersonUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
        @Mock
        private PersonRepository personRepository;

        @InjectMocks
        private PersonService personService;

        @Test
        void testPersonDTO() {
//            PersonDTO personDTO = createFakeDTO();
//            Person expectedSavedPerson = createFakeEntity();
//
//            when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);
//
//            MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage("Usuario cadastrado seu id é: "+expectedSavedPerson.getId());
//            MessageResponseDTO successMessage = personService.createPerson(personDTO);
//
//            assertEquals(expectedSuccessMessage, successMessage);
        }

    private MessageResponseDTO createExpectedSuccessMessage(String message) {
        return MessageResponseDTO.builder()
                .message(message)
                .build();
    }
}
