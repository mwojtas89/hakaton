package com.hakaton.controllers;

import com.hakaton.domain.User;
import com.hakaton.domain.UserDto;
import com.hakaton.mapper.UserMapper;
import com.hakaton.service.UserDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserDbService userDbService;
    private final UserMapper userMapper;

    @GetMapping(value = "/{localization}")
    public ResponseEntity<List<UserDto>> getUsersByLocation (@PathVariable String localization) {
        List<User> usersFromDb = userDbService.getByLocation(localization);
        return ResponseEntity.ok(userMapper.mapToListUserDto(usersFromDb));
    }
}
