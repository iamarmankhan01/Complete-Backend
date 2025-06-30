package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
