package com.example.copy.controlller.auth;

import com.example.copy.payload.auth.AuthRequest;
import com.example.copy.service.auth.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wtx/ca/v1/auth")
@RequiredArgsConstructor
public class AuthController extends com.example.copy.controlller.auth.RestController {

    private final AuthService authService;

    @PostMapping("/login")
    public Object login(@RequestBody @Valid AuthRequest payload) throws Throwable {
        return ok(authService.login(payload));
    }

}
