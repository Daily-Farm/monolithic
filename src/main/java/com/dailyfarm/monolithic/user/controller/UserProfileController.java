package com.dailyfarm.monolithic.user.controller;

import com.dailyfarm.monolithic.user.dto.UserProfileResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/profile")
public class UserProfileController {

    @GetMapping
    public UserProfileResponse getProfile() {
        return new UserProfileResponse("+972531234567", 32.068424, 34.774802);
    }
}
