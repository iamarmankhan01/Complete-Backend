package com.app.arman.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.arman.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
