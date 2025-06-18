package com.dailyfarm.monolithic.user.dto;

import lombok.Data;

@Data
public class UserProfileResponse {

    private final String phone;
    private final double latitude;
    private final double longitude;
}
