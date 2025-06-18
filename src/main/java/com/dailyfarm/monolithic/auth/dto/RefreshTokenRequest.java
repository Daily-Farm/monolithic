package com.dailyfarm.monolithic.auth.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private final String refreshToken;
}
