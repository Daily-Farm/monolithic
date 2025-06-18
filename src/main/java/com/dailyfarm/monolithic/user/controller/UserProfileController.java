package com.dailyfarm.monolithic.user.controller;

import com.dailyfarm.monolithic.user.dto.UserProfileRequest;
import com.dailyfarm.monolithic.user.dto.UserProfileResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/profile")
public class UserProfileController {

    @GetMapping
    public UserProfileResponse getProfile() {
        return new UserProfileResponse("+972531234567", 32.068424, 34.774802);
    }

    @PutMapping
    public UserProfileResponse updateProfile(@RequestBody UserProfileRequest request) {
        return new UserProfileResponse(request.getPhone(), request.getLatitude(), request.getLongitude());
    }
}
