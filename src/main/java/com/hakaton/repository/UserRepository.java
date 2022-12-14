package com.hakaton.repository;

import com.hakaton.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository <User, Long> {
    List<User> getByLocation (String location);
}
