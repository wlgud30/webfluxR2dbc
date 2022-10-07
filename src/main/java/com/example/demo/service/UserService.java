package com.example.demo.service;

import com.example.demo.data.request.UserCreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<Long> CreateUser(UserCreateRequestDto dto);
}
