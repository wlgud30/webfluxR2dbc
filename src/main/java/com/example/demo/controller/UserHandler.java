package com.example.demo.controller;

import com.example.demo.data.request.UserCreateRequestDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
@RequiredArgsConstructor
public class UserHandler {

    @Autowired
    private UserService userService;

    public Mono<ServerResponse> create(ServerRequest request){
        var dto = request.bodyToMono(UserCreateRequestDto.class);
        var result = dto.flatMap(d->userService.CreateUser(d));
        var body = ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result,Long.class);
        return body;
    }
}
