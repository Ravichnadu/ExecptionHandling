package com.marolix.execption.info;

import java.time.LocalDateTime;

public class InfoExecption {
	
	private String code;
	
	private String msg;
	
	private LocalDateTime time;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "InfoExecption [code=" + code + ", msg=" + msg + ", time=" + time + "]";
	}

	public InfoExecption(String code, String msg, LocalDateTime time) {
		super();
		this.code = code;
		this.msg = msg;
		this.time = time;
	}

	public InfoExecption() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
