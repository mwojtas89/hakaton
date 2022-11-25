package com.hakaton.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String eMail;
    private String password;
    private String firstName;
    private String lastName;
    private String description;
    private LocalDate birthDate;
    private String location;
    private String pictureUrl;
    private List<Sports> sportsList;
}
