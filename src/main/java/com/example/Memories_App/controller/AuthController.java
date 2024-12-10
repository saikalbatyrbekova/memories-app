package com.example.Memories_App.controller;

import com.example.Memories_App.model.dto.auth.AuthLoginRequest;
import com.example.Memories_App.model.dto.auth.AuthRegisterRequest;
import com.example.Memories_App.model.dto.auth.AuthResponse;
import com.example.Memories_App.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody AuthRegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthLoginRequest request) {
        return authService.login(request);
    }
}
