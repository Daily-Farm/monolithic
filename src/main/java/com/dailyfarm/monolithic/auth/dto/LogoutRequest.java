package com.dailyfarm.monolithic.auth.dto;

import lombok.Data;

@Data
public class LogoutRequest {
    private final String refreshToken;
}
