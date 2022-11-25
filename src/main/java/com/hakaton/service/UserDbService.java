package com.hakaton.service;

import com.hakaton.domain.User;
import com.hakaton.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDbService {

    private final UserRepository userRepository;

    public User saveUser (User user) {
        return userRepository.save(user);
    }

    public List<User> getByLocation (String location) {
        return userRepository.getByLocation(location);
    }

}
