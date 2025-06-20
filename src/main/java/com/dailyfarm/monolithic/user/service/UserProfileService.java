package com.dailyfarm.monolithic.user.service;

import com.dailyfarm.monolithic.user.model.UserProfile;
import com.dailyfarm.monolithic.user.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public UserProfile create(Long userId) {
        UserProfile userProfile = new UserProfile();
        userProfile.setUserId(userId);

        return userProfileRepository.save(userProfile);
    }

    public UserProfile read(Long userId) {
        return userProfileRepository.findById(userId).orElse(null);
    }
}
