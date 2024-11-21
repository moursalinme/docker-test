package com.docker.test;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepo userRepo;

    @GetMapping("/user")
    public ResponseEntity<List<UserModel>> getAllUsers() {
        return ResponseEntity.ok().body(userRepo.findAll());
    }

    @PostMapping("/user")
    public ResponseEntity<UserModel> addUserEntity(@RequestBody UserModel user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userRepo.save(user));
    }

}
