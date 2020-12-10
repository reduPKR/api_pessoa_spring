package com.digitalinnovation.personaapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception{
    public PersonNotFoundException(long id){
        super("Usuario com id "+id+" nao existe");
    }
}
