package com.moonlight.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moonlight.sso.entity.ResponseResult;
import com.moonlight.sso.service.SSOService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	SSOService ssoService;
	
	@GetMapping("/{id}")
	public ResponseResult getUserInfo(@PathVariable long id) {
		return ssoService.getUserInfo(id);
	}
}
