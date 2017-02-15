package com.model;

public class Menu {
	private int MenuId ;
	private String MenuName ;
	private String MenuContent ;
	private double MenuPrice ;
	public int getMenuId() {
		return MenuId;
	}
	public void setMenuId(int menuId) {
		MenuId = menuId;
	}
	public String getMenuName() {
		return MenuName;
	}
	public void setMenuName(String menuName) {
		MenuName = menuName;
	}
	public String getMenuContent() {
		return MenuContent;
	}
	public void setMenuContent(String menuContent) {
		MenuContent = menuContent;
	}
	public double getMenuPrice() {
		return MenuPrice;
	}
	public void setMenuPrice(double menuPrice) {
		MenuPrice = menuPrice;
	}
	@Override
	public String toString() {
		return "Orders [MenuId=" + MenuId + ", MenuName=" + MenuName + ", MenuContent=" + MenuContent + ", MenuPrice="
				+ MenuPrice + "]";
	}
}
