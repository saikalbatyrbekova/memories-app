package com.example.Memories_App.service;

import com.example.Memories_App.model.dto.auth.AuthLoginRequest;
import com.example.Memories_App.model.dto.auth.AuthRegisterRequest;
import com.example.Memories_App.model.dto.auth.AuthResponse;

public interface AuthService {
    AuthResponse register(AuthRegisterRequest request);
    AuthResponse login(AuthLoginRequest request);
}
