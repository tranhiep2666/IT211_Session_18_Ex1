package com.example.ex1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequest {

    private String phone;

    @Email
    private String email;

    @NotBlank
    private String password;
}
