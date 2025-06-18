package com.dailyfarm.monolithic.auth.dto;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private final String currentPassword;
    private final String newPassword;
}
