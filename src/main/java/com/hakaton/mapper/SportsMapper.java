package com.hakaton.mapper;

import com.hakaton.domain.Sports;
import com.hakaton.domain.SportsDto;
import com.hakaton.domain.User;
import com.hakaton.domain.UserDto;
import com.hakaton.service.SportsDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SportsMapper {

    public Sports mapToSports (SportsDto sportsDto) {
        return null;
    }

    public SportsDto mapToSportsDto (Sports sports) {
        return new SportsDto(sports.getId(), sports.getName());
    }
}
