package com.digitalinnovation.personaapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PhoneType {
    HOME("home"),
    MOBILE("mobile"),
    COMMERCIAL("Comercial");

    private final String description;
}
