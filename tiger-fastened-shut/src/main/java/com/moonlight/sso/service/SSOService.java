package com.moonlight.sso.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonlight.sso.entity.RegisterPhone;
import com.moonlight.sso.entity.ResponseResult;
import com.moonlight.sso.jpa.entity.User;
import com.moonlight.sso.jpa.repository.UserRepository;

@Service
public class SSOService {
	@Autowired
	UserRepository userRepository;
	
	public ResponseResult signinByPhoneNum(RegisterPhone registerPhone) {
		String phoneNum = registerPhone.getPhoneNum();
		Optional<User> user = userRepository.findByPhoneNum(registerPhone.getPhoneNum());
		if(!user.isEmpty()) {
			return new ResponseResult(user);
		}
		User registerNewPhoneUser = new User(phoneNum);
		userRepository.save(registerNewPhoneUser);
		return new ResponseResult(registerNewPhoneUser);
	}
	
	public ResponseResult getUserInfo(long id) {
		Optional<User> users = userRepository.findById(id);
		return new ResponseResult(users);
	}
}
