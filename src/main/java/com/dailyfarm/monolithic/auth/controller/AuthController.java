package com.dailyfarm.monolithic.auth.controller;

import com.dailyfarm.monolithic.auth.dto.AuthResponse;
import com.dailyfarm.monolithic.auth.dto.LoginRequest;
import com.dailyfarm.monolithic.auth.dto.RegisterRequest;
import com.dailyfarm.monolithic.auth.model.User;
import com.dailyfarm.monolithic.auth.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        user = authService.register(user);

        String accessToken = "generated-access-token";
        String refreshToken = "generated-refresh-token";

        return new AuthResponse(accessToken, refreshToken);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        user = authService.login(user);

        String accessToken = "generated-access-token";
        String refreshToken = "generated-refresh-token";

        return new AuthResponse(accessToken, refreshToken);
    }
}
