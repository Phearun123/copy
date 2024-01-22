package com.example.copy.payload.auth;

import com.example.copy.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    @Override
    public Object login(AuthRequest authRequest) throws Throwable {
        return null;
    }
}
