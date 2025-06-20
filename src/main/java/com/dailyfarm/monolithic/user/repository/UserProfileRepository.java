package com.dailyfarm.monolithic.user.repository;

import com.dailyfarm.monolithic.user.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
