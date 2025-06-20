package com.dailyfarm.monolithic.auth.integration;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestUserProfileClient implements UserProfileClient {

    private final RestTemplate restTemplate;

    public RestUserProfileClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void createProfile(Long userId) {
        String url = "http://localhost:8080/api/user/profile/create?userId=" + userId;
        restTemplate.postForLocation(url, null);
    }
}
