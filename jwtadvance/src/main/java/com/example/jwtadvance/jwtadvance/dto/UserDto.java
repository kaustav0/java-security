package com.example.jwtadvance.jwtadvance.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
