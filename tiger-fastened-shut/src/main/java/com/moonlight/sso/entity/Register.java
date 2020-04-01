package com.moonlight.sso.entity;

import javax.validation.constraints.Pattern;

public class Register {
	
	@Pattern(regexp="^1[3|4|5|7|8][0-9]{4,13}$",message="手机号的格式错误！")
	private String phoneNum;

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
