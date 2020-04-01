package com.moonlight.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moonlight.sso.entity.RegisterOauth;
import com.moonlight.sso.entity.RegisterPhone;
import com.moonlight.sso.entity.ResponseResult;
import com.moonlight.sso.service.SSOService;

/**
 * SSO控制层
 * 
 * @author sunan
 * @since 2020-04-01
 */
@RestController
@RequestMapping("/sso")
public class SSOController {

	@Autowired
	SSOService ssoService;

	@PostMapping("/signinByPhoneNum")
	public ResponseResult signinByPhoneNum(@Validated RegisterPhone registerPhone) {
		return ssoService.signinByPhoneNum(registerPhone);
	}
	
	@PostMapping("/signinByOauth")
	public ResponseResult signinByOauth(@Validated RegisterOauth registerOauth) {
		return new ResponseResult(registerOauth);
	}
}
