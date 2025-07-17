package com.app.arman.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserEmail(String userEmail);
}
