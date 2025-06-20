package com.dailyfarm.monolithic.auth.service;

import com.dailyfarm.monolithic.auth.integration.UserProfileClient;
import com.dailyfarm.monolithic.auth.model.User;
import com.dailyfarm.monolithic.auth.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserProfileClient userProfileClient;

    public AuthService(
        UserRepository userRepository,
        PasswordEncoder passwordEncoder,
        UserProfileClient userProfileClient
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userProfileClient = userProfileClient;
    }

    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user = userRepository.save(user);

        userProfileClient.createProfile(user.getId());

        return user;
    }

    public User login(User user) {
        return userRepository.findByEmail(user.getEmail())
            .filter(other -> passwordEncoder.matches(user.getPassword(), other.getPassword()))
            .orElse(null);
    }
}
