package com.model;

import java.util.Date;
/**
 * 用户信息类
 * @author heyanzhu
 *
 */
public class UserInfo {
	private int UserInfoId ;
	private String UserInfoAddress ;//地址
	private String UserInfoTel ;//电话
	private String UserInfoMovPhone ;//手机
	private Date UserInfoSendDate ;//发送日期
	private User user;//用户信息
	public int getUserInfoId() {
		return UserInfoId;
	}
	public void setUserInfoId(int userInfoId) {
		UserInfoId = userInfoId;
	}
	public String getUserInfoAddress() {
		return UserInfoAddress;
	}
	public void setUserInfoAddress(String userInfoAddress) {
		UserInfoAddress = userInfoAddress;
	}
	public String getUserInfoTel() {
		return UserInfoTel;
	}
	public void setUserInfoTel(String userInfoTel) {
		UserInfoTel = userInfoTel;
	}
	public String getUserInfoMovPhone() {
		return UserInfoMovPhone;
	}
	public void setUserInfoMovPhone(String userInfoMovPhone) {
		UserInfoMovPhone = userInfoMovPhone;
	}
	public Date getUserInfoSendDate() {
		return UserInfoSendDate;
	}
	public void setUserInfoSendDate(Date userInfoSendDate) {
		UserInfoSendDate = userInfoSendDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserInfo [UserInfoId=" + UserInfoId + ", UserInfoAddress=" + UserInfoAddress + ", UserInfoTel="
				+ UserInfoTel + ", UserInfoMovPhone=" + UserInfoMovPhone + ", UserInfoSendDate=" + UserInfoSendDate
				+ ", user=" + user + "]";
	}
	
}
