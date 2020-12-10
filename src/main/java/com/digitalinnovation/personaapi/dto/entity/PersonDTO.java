package com.digitalinnovation.personaapi.dto.entity;

import com.digitalinnovation.personaapi.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private long id;

    @NotEmpty
    @Size(min=3, max=100)
    private String first_name;

    @NotEmpty
    @Size(min=3, max=100)
    private String last_name;

    @NotEmpty
    @CPF
    private String cpf;

    private LocalDate birthdate;

    @Valid
    @NotEmpty
    private List<Phone> phones = new ArrayList<>();
}
