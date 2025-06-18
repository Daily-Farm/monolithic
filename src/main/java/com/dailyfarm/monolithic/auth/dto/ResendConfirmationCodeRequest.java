package com.dailyfarm.monolithic.auth.dto;

import lombok.Data;

@Data
public class ResendConfirmationCodeRequest {
    private final String email;
}
