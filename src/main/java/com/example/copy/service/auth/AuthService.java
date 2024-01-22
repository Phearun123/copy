package com.example.copy.service.auth;

import com.example.copy.payload.auth.AuthRequest;

public interface AuthService {

    Object login(AuthRequest payload) throws Throwable;
}
