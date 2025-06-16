package com.dailyfarm.monolithic.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private final String email;
    private final String password;
}
