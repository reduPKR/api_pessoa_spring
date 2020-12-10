package com.digitalinnovation.personaapi.repository;

import com.digitalinnovation.personaapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository nao esta implementando nada pos o JpaRepository<class,typeId> implementa varias funcoes
public interface PersonRepository extends JpaRepository<Person,Long> {
}
