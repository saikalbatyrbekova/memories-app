package com.example.Memories_App.mapper;


import com.example.Memories_App.model.domain.User;
import com.example.Memories_App.model.dto.auth.AuthRegisterRequest;
import com.example.Memories_App.model.dto.auth.AuthResponse;

public interface AuthMapper {
    AuthResponse toResponse(User user, String token);
    User toUser(AuthRegisterRequest request, User user);
}
