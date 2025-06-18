package com.dailyfarm.monolithic.auth.controller;

import com.dailyfarm.monolithic.auth.dto.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    AuthResponse register(@RequestBody RegisterRequest request) {
        String accessToken = "generated-access-token";
        String refreshToken = "generated-refresh-token";
        return new AuthResponse(accessToken, refreshToken);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        String accessToken = "generated-access-token";
        String refreshToken = "generated-refresh-token";
        return new AuthResponse(accessToken, refreshToken);
    }

    @PostMapping("/refresh-token")
    public AuthResponse refreshToken(@RequestBody RefreshTokenRequest request) {
        String accessToken = "new-access-token";
        String refreshToken = "new-refresh-token";
        return new AuthResponse(accessToken, refreshToken);
    }

    @PostMapping("/logout")
    public void logout(@RequestBody LogoutRequest request) {
    }

    @PostMapping("/change-password")
    public void changePassword(@RequestBody ChangePasswordRequest request) {
    }

    @PostMapping("/confirm-email")
    public void confirmEmail(@RequestBody ConfirmEmailRequest request) {
    }

    @PostMapping("/resend-confirmation-code")
    public void resendConfirmationCode(@RequestBody ResendConfirmationCodeRequest request) {
    }

    @PostMapping("/change-email")
    public void changeEmail(@RequestBody ChangeEmailRequest request) {
    }
}
