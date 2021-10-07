package com.crutchesbicycles.npngbackend.controller;

import com.crutchesbicycles.npngbackend.domain.User;
import com.crutchesbicycles.npngbackend.dto.UserDto;
import com.crutchesbicycles.npngbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(userService.getAllUsers().stream().map(UserDto::new).collect(Collectors.toList()));
    }

    @GetMapping(value = "/{email}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUsers(@PathVariable String email){
        Optional<User> optionalUser = userService.findByEmail(email);
        if (optionalUser.isEmpty()){
            log.info(String.format("User with email %s not found", email));
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(new UserDto(optionalUser.get()));
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
