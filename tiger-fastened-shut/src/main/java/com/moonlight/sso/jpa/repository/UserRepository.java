package com.moonlight.sso.jpa.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.moonlight.sso.jpa.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByPhoneNum(String phoneNum);
}
