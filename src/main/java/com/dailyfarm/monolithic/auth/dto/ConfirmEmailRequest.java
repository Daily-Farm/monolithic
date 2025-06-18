package com.dailyfarm.monolithic.auth.dto;

import lombok.Data;

@Data
public class ConfirmEmailRequest {
    private final String email;
    private final String code;
}
