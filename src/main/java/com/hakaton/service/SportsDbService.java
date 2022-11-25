package com.hakaton.service;

import com.hakaton.domain.Sports;
import com.hakaton.repository.SportsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SportsDbService {

    private final SportsRepository sportsRepository;

    public Sports save (Sports sports) {
        return sportsRepository.save(sports);
    }
}
