package com.dailyfarm.monolithic.dto;

import lombok.Data;

@Data
public class ChangeEmailRequest {
    private final String currentEmail;
    private final String newEmail;
    private final String password;
}

