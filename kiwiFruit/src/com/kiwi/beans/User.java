package com.kiwi.beans;

public class User {
	private Long userid;
	private String loginname;
	private String password;
	private Long usertype;
	private Long isvalid;
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getUsertype() {
		return usertype;
	}
	public void setUsertype(Long usertype) {
		this.usertype = usertype;
	}
	public Long getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(Long isvalid) {
		this.isvalid = isvalid;
	}
	
}
