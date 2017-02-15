create table sex(
	SexId int notnull auto_increment,
	SexType char(5) notnull,
	primary key(Sexid)
)engine=InnoDB auto_increment=54 default charset=utf-8

create table user(
	UserId int notnull auto_increment,
	UserName char(12) notnull,
	UserPassword char(16) notnull,
	UserMail char(50) notnull,
	UserRealName char(16) notnull,
	SexId int notnull,
	UserFlag char(10) notnull,
	primary key (UserId),
	constraint 'user_sex' foreign key ('SexId') references 'sex' ('SexId') on delete cascade on update cascade
)engine=InnoDB auto_increment=54 delete charset=utf-8

create table UserInfo(
	UserInfoId int notnull auto_increment,
	UserInfoAddress char(100) notnull,
	UserInfoTel char(20) notnull,
	UserInfoMovPhone char(20) notnull,
	UserInfoSendDate date notnull,
	UserId int notnull,
	primary key (UserInfoId),
	constraint 'userinfo_user' foreign key ('UserId') references 'user' ('UserId') on delete cascade on update cascade
)engine=InnoDB auto_increment=54 delete charset=utf-8

create table Menu(
	MenuId int notnull auto_increment,
	MenuName char(100) notnull,
	MenuContent char(300) ,
	MenuPrice decimal(6,2) notnull, 
	primary key (MenuId)
)engine=InnoDB auto_increment=54 delete charset=utf-8

create table Orders(
	OrdersId int notnull auto_increment,
	OrdersNum int notnull,
	OrdersNotice char(300),
	MenuId int notnull,
	UserId int notnull,
	OrdersStatus int notnull,
	OrdersDate date notnull,
	primary key(OrdersId),
	constraint 'orders_menu' foreign key('MenuId') references 'Menu'('MenuId') on delete set null on update no action,
	constraint 'orders_user' foreign key('UserId') references 'User'('UserId') on delete cascade on update cascade
)engine=InnoDB auto_increment=54 delete charset=utf-8

create table MenuList(
	MenuListId int notnull auto_increment,
	MenuListName char(50) notnull,
	MenuListCount int notnull,
	MenuListPrice decimal(6,2) notnull,
	MenuListTotal decimal(10,2) notnull,
	MenuListContent char(300) ,
	OrdersId int notnull,
	UserId int notnull,
	MenuListSendName char(50) notnull,
	MenuListSendTel char(20) notnull,
	MenuListSendTime date notnull,
	MenuListState int notnull,
	primary key(MenuListId),
	constraint "menulist_order" foreign key('OrdersId') references 'Orders'('OrdersId') on delete cascade on update cascade,
	constraint "menulist_user" foreign key('UserId') references 'User'('UserId') on delete cascade on update cascade
)engine=InnoDB auto_increment=54 delete charset=utf-8