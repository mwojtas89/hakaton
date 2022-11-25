package com.hakaton.repository;

import com.hakaton.domain.Sports;
import org.springframework.data.repository.CrudRepository;

public interface SportsRepository extends CrudRepository <Sports, Long> {
    Sports getById (Long id);
}
