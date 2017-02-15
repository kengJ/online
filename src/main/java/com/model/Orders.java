package com.model;

import java.util.Date;

public class Orders {
	private int OrdersId ;
	private int OrdersNum ;
	private String OrdersNotice ;
	private Menu menu;
	private User user;
	private int OrdersStatus ;
	private Date OrdersDate;
	public int getOrdersId() {
		return OrdersId;
	}
	public void setOrdersId(int ordersId) {
		OrdersId = ordersId;
	}
	public int getOrdersNum() {
		return OrdersNum;
	}
	public void setOrdersNum(int ordersNum) {
		OrdersNum = ordersNum;
	}
	public String getOrdersNotice() {
		return OrdersNotice;
	}
	public void setOrdersNotice(String ordersNotice) {
		OrdersNotice = ordersNotice;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getOrdersStatus() {
		return OrdersStatus;
	}
	public void setOrdersStatus(int ordersStatus) {
		OrdersStatus = ordersStatus;
	}
	public Date getOrdersDate() {
		return OrdersDate;
	}
	public void setOrdersDate(Date ordersDate) {
		OrdersDate = ordersDate;
	}
	@Override
	public String toString() {
		return "Orders [OrdersId=" + OrdersId + ", OrdersNum=" + OrdersNum + ", OrdersNotice=" + OrdersNotice
				+ ", menu=" + menu + ", user=" + user + ", OrdersStatus=" + OrdersStatus + ", OrdersDate=" + OrdersDate
				+ "]";
	}
	
}
