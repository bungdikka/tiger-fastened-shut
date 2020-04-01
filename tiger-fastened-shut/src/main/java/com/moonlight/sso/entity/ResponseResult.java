package com.moonlight.sso.entity;

public class ResponseResult {
	private int code;
	private String msg;
	private Object data;

	public ResponseResult(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResponseResult(Object data) {
		super();
		this.code = 0;
		this.msg = "成功";
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
