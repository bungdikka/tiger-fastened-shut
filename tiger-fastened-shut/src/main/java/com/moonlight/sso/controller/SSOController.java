package com.moonlight.sso.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moonlight.sso.entity.Register;

@RestController
@RequestMapping("/sso")
public class SSOController {
	
	@PostMapping("/regist")
	public Map<String,Object> regist(@Validated Register register) {
		Map<String,Object> map = new HashMap<>();
		map.put("msg", register.getPhoneNum());
		return map;
	}
}
