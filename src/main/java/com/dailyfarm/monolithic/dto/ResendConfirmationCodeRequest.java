package com.dailyfarm.monolithic.dto;

import lombok.Data;

@Data
public class ResendConfirmationCodeRequest {
    private final String email;
}
