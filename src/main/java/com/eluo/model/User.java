package com.eluo.model;

import java.io.Serializable;

public class User implements Serializable {
	
	private int idx;
	private String userid;
	private String passwd;
	private String usernm;
	private String tel;
	private String email;
	private String regDate;
	
	public User(int idx, String userid, String passwd, String usernm, String tel, String email, String regDate) {
		super();
		this.idx = idx;
		this.userid = userid;
		this.passwd = passwd;
		this.usernm = usernm;
		this.tel = tel;
		this.email = email;
		this.regDate = regDate;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsernm() {
		return usernm;
	}
	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "User [idx=" + idx + ", userid=" + userid + ", passwd=" + passwd + ", usernm=" + usernm + ", tel=" + tel
				+ ", email=" + email + ", regDate=" + regDate + "]";
	}

}
