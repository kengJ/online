package com.model;

public class User {
	private int UserId;
	private String UserName ;
	private String UserPassword ;
	private String UserMail ;
	private String UserRealName ;
	private Sex Sex;
	private String UserFlag ;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserMail() {
		return UserMail;
	}
	public void setUserMail(String userMail) {
		UserMail = userMail;
	}
	public String getUserRealName() {
		return UserRealName;
	}
	public void setUserRealName(String userRealName) {
		UserRealName = userRealName;
	}
	public Sex getSex() {
		return Sex;
	}
	public void setSex(Sex sex) {
		Sex = sex;
	}
	public String getUserFlag() {
		return UserFlag;
	}
	public void setUserFlag(String userFlag) {
		UserFlag = userFlag;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserPassword=" + UserPassword + ", UserMail="
				+ UserMail + ", UserRealName=" + UserRealName + ", Sex=" + Sex + ", UserFlag=" + UserFlag + "]";
	}
	
	
}
