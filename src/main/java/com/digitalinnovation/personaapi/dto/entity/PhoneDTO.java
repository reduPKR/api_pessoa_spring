package com.digitalinnovation.personaapi.dto.entity;

import com.digitalinnovation.personaapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
    private long id;

    @NotEmpty
    @Size(min=13, max=14)
    private String number;

    @Enumerated(EnumType.STRING)
    private PhoneType phone_type;
}
