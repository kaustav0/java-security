package com.example.jwtadvance.jwtadvance.controller;

import com.example.jwtadvance.jwtadvance.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/adduser")
    public String addUser(@RequestBody UserDto userDto)
    {

    }

}
