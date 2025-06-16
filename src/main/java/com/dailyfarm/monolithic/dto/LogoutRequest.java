package com.dailyfarm.monolithic.dto;

import lombok.Data;

@Data
public class LogoutRequest {
    private final String refreshToken;
}
