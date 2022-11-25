package com.hakaton.mapper;

import com.hakaton.domain.User;
import com.hakaton.domain.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserMapper {

    public User mapToUser (UserDto userDto) {
        return new User(userDto.getId(), userDto.getEMail(), userDto.getPassword(), userDto.getFirstName(),
                userDto.getLastName(), userDto.getBirthDate(), userDto.getDescription(), userDto.getLocation(),
                userDto.getPictureUrl(), userDto.getSportsList());
    }

    public List<User> mapToListUser (List<UserDto> userDtoList) {
        List<User> users = new ArrayList<>();
        for(int i =0; i<userDtoList.size(); i++) {
            users.add(new User(userDtoList.get(i).getId(), userDtoList.get(i).getEMail(), userDtoList.get(i).getPassword(),
                    userDtoList.get(i).getFirstName(), userDtoList.get(i).getLastName(), userDtoList.get(i).getBirthDate(),
                    userDtoList.get(i).getDescription(), userDtoList.get(i).getLocation(), userDtoList.get(i).getPictureUrl(),
                    userDtoList.get(i).getSportsList()));
        }
        return users;
    }

    public List<UserDto> mapToListUserDto (List<User> userlist) {
        List<UserDto> users = new ArrayList<>();
        for(int i =0; i<userlist.size(); i++) {
            users.add(new UserDto(userlist.get(i).getId(), userlist.get(i).getEMail(), userlist.get(i).getPassword(),
                    userlist.get(i).getFirstName(), userlist.get(i).getLastName(), userlist.get(i).getDescription(),
                    userlist.get(i).getBirthDate(), userlist.get(i).getLocation(), userlist.get(i).getPictureUrl(),
                    userlist.get(i).getSportsList()));
        }
        return users;
    }

    public UserDto mapToUserDto (User user) {
        return new UserDto(user.getId(), user.getEMail(), user.getPassword(), user.getFirstName(), user.getLastName(),
                user.getDescription(), user.getBirthDate(), user.getLocation(), user.getPictureUrl(), user.getSportsList());
    }

}
