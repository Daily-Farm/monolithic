package com.dailyfarm.monolithic.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private final String refreshToken;
}
