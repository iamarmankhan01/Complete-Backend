package com.app.arman.service;

import java.util.Optional;

import com.app.arman.entity.User;

public interface IUserService {

	public Integer saveUser(User user);
	public Optional<User> findByUserEmail(String userEmail);
}
