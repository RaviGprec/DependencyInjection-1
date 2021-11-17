package com.ravi.service;

import java.util.Optional;

import com.ravi.model.User;

public interface IUserRepoService {
	User findUserByUserName(String username);
}
