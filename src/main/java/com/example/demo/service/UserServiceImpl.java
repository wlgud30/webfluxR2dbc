package com.example.demo.service;

import com.example.demo.data.request.UserCreateRequestDto;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

//    @Override
//    public Mono<Long> CreateUser(UserCreateRequestDto dto) {
//        return null;
//    }

    @Override
    public Mono<Long> CreateUser(UserCreateRequestDto dto) {
        return userRepository.save(dto.toUser())
                .map(user -> user.getId());
    }
}
