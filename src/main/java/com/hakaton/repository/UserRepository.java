package com.hakaton.repository;

import com.hakaton.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
}
