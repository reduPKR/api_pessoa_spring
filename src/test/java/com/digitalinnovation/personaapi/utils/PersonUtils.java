package com.digitalinnovation.personaapi.utils;

import com.digitalinnovation.personaapi.dto.entity.PersonDTO;
import com.digitalinnovation.personaapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String first_name = "Rafael";
    private static final String last_name = "Eduardo";
    private static final String cpf = "123.456.789-10";
    private static final long id = 1;
    public static final LocalDate birthdate = LocalDate.of(1994, 2, 28);

    public static PersonDTO createFakeDTO() {
//        return PersonDTO.builder()
//                .first_name(first_name)
//                .last_name(last_name)
//                .cpf(cpf)
//                .birthdate(LocalDate.of(1994, 2, 28))
//                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
//                .build();
        return null;
    }

    public static Person createFakeEntity() {
//        return Person.builder()
//                .id(id)
//                .first_name(first_name)
//                .last_name(last_name)
//                .cpf(cpf)
//                .birthdate(LocalDate.of(1994, 2, 28))
//                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
//                .build();
        return null;
    }




}
