package com.ravi.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ravi.model.User;

public interface IUserRepository extends MongoRepository<User, String>{
	@Query("{username:?0}")
	User findByUserName(String username);
}
