package com.example.demo.data.request;

import com.example.demo.data.entity.User;
import lombok.Data;

@Data
public class UserCreateRequestDto {
    public String email;

    public String password;

    public String name;

    public User toUser(){
        return User.builder()
                .email(email)
                .password(password)
                .name(name)
                .build();
    }
}
