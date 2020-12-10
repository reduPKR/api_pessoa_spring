package com.digitalinnovation.personaapi.repository;

import com.digitalinnovation.personaapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
