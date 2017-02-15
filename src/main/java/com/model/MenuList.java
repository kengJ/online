package com.model;

import java.util.Date;

public class MenuList {
	private int MenuListId ;
	private String MenuListName ;
	private int MenuListCount ;
	private double MenuListPrice ;
	private double MenuListTotal ;
	private String MenuListContent ;
	private Orders orders;
	private User user;
	private String MenuListSendName ;
	private String MenuListSendTel ;
	private Date MenuListSendTime ;
	private int MenuListState ;
	public int getMenuListId() {
		return MenuListId;
	}
	public void setMenuListId(int menuListId) {
		MenuListId = menuListId;
	}
	public String getMenuListName() {
		return MenuListName;
	}
	public void setMenuListName(String menuListName) {
		MenuListName = menuListName;
	}
	public int getMenuListCount() {
		return MenuListCount;
	}
	public void setMenuListCount(int menuListCount) {
		MenuListCount = menuListCount;
	}
	public double getMenuListPrice() {
		return MenuListPrice;
	}
	public void setMenuListPrice(double menuListPrice) {
		MenuListPrice = menuListPrice;
	}
	public double getMenuListTotal() {
		return MenuListTotal;
	}
	public void setMenuListTotal(double menuListTotal) {
		MenuListTotal = menuListTotal;
	}
	public String getMenuListContent() {
		return MenuListContent;
	}
	public void setMenuListContent(String menuListContent) {
		MenuListContent = menuListContent;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMenuListSendName() {
		return MenuListSendName;
	}
	public void setMenuListSendName(String menuListSendName) {
		MenuListSendName = menuListSendName;
	}
	public String getMenuListSendTel() {
		return MenuListSendTel;
	}
	public void setMenuListSendTel(String menuListSendTel) {
		MenuListSendTel = menuListSendTel;
	}
	public Date getMenuListSendTime() {
		return MenuListSendTime;
	}
	public void setMenuListSendTime(Date menuListSendTime) {
		MenuListSendTime = menuListSendTime;
	}
	public int getMenuListState() {
		return MenuListState;
	}
	public void setMenuListState(int menuListState) {
		MenuListState = menuListState;
	}
	@Override
	public String toString() {
		return "MenuList [MenuListId=" + MenuListId + ", MenuListName=" + MenuListName + ", MenuListCount="
				+ MenuListCount + ", MenuListPrice=" + MenuListPrice + ", MenuListTotal=" + MenuListTotal
				+ ", MenuListContent=" + MenuListContent + ", orders=" + orders + ", user=" + user
				+ ", MenuListSendName=" + MenuListSendName + ", MenuListSendTel=" + MenuListSendTel
				+ ", MenuListSendTime=" + MenuListSendTime + ", MenuListState=" + MenuListState + "]";
	}
	
}
