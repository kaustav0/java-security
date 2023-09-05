package com.example.jwtadvance.jwtadvance.service;

import com.example.jwtadvance.jwtadvance.dto.UserDto;
import org.springframework.stereotype.Service;


public interface UserService {

    public String addUser(UserDto userDto);

}
