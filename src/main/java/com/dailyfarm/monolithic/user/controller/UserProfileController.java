package com.dailyfarm.monolithic.user.controller;

import com.dailyfarm.monolithic.user.dto.UserProfileResponse;
import com.dailyfarm.monolithic.user.model.UserProfile;
import com.dailyfarm.monolithic.user.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/profile")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PostMapping("/create")
    public UserProfileResponse create(@RequestParam Long userId) {
        UserProfile userProfile = userProfileService.create(userId);

        return new UserProfileResponse(
            userProfile.getPhone(),
            userProfile.getLatitude(),
            userProfile.getLongitude()
        );
    }

    @GetMapping("/{userId}")
    public UserProfileResponse read(@PathVariable Long userId) {
        UserProfile userProfile = userProfileService.read(userId);

        return new UserProfileResponse(
            userProfile.getPhone(),
            userProfile.getLatitude(),
            userProfile.getLongitude()
        );
    }
}
