package com.model;

import java.util.Date;
/**
 * 菜单列表类
 * @author heyanzhu
 *
 */
public class MenuList {
	private int MenuListId ;
	private String MenuListName ;//菜单列表名
	private int MenuListCount ;//数量
	private double MenuListPrice ;//价格
	private double MenuListTotal ;//总价
	private String MenuListContent ;//备注
	private Orders orders;//订单类
	private User user;//用户
	private String MenuListSendName ;//下单人
	private String MenuListSendTel ;//下单电话
	private Date MenuListSendTime ;//下单时间
	private int MenuListState ;//状态
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
