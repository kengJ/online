package com.model;

import java.util.Date;
/**
 * 订单类
 * @author heyanzhu
 *
 */
public class Orders {
	private int OrdersId ;
	private int OrdersNum ;//订单名称
	private String OrdersNotice ;//备注
	private Menu menu;//菜单
	private User user;//用户
	private int OrdersStatus ;//订单状态
	private Date OrdersDate;//下单日期
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
