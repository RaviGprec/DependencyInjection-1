package com.ravi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ravi.model.User;
import com.ravi.repository.IUserRepository;

@Service
public class UserRepoServiceImpl implements IUserRepoService {

	@Autowired
	IUserRepository userReposioty;
	@Override
	public User findUserByUserName(String username) {
		System.out.println("findUserByUserName()::username:"+username);
		System.out.println("findUserByUserName()::pwd from db:"+userReposioty.findByUserName(username).getPassword());
		return userReposioty.findByUserName(username);
	}

	
}
