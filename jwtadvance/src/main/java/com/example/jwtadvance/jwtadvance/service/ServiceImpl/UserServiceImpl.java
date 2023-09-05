package com.example.jwtadvance.jwtadvance.service.ServiceImpl;

import com.example.jwtadvance.jwtadvance.Entity.UserEntity;
import com.example.jwtadvance.jwtadvance.dto.UserDto;
import com.example.jwtadvance.jwtadvance.service.UserService;

import java.util.stream.Stream;

public class UserServiceImpl implements UserService {
    @Override
    public String addUser(UserDto userDto) {

        UserEntity userEntity= new UserEntity();
        userEntity.setFirstname(userDto.getFirstname());
        userEntity.setLastname(userDto.getLastname());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword();


        return null;
    }
}
