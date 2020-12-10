package com.digitalinnovation.personaapi.entity;

import com.digitalinnovation.personaapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Anotacoes do lombok, evita ter que escrever get set e constuctor
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType phone_type;
}
