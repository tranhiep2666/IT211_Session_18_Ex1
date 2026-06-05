package com.example.ex1.controller;

import com.example.ex1.dto.AuthResponse;
import com.example.ex1.dto.LoginRequest;
import com.example.ex1.dto.RegisterRequest;
import com.example.ex1.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public String register(
            @Valid @RequestBody RegisterRequest request) {

        service.register(request);

        return "Register successfully";
    }

    @PostMapping("/login")
    public AuthResponse login(
            @RequestBody LoginRequest request) {

        return service.login(request);
    }
}