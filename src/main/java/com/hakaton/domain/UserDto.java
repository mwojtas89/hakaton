package com.hakaton.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class UserDto {
    private String firstName;
    private String lastName;
    private String description;
    private LocalDate birthDate;
    private String location;
}
