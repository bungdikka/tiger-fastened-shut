package com.moonlight.sso.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String phoneNum;

	protected User() {
	}

	public User(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return String.format("User[id=%d, phoneNum='%s']", id, phoneNum);
	}

	public Long getId() {
		return id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}