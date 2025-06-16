package com.dailyfarm.monolithic.dto;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private final String currentPassword;
    private final String newPassword;
}
