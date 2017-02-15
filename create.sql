create table sex(
	SexId int auto_increment,
	SexType char(5) not null,
	primary key(Sexid)
)engine=InnoDB auto_increment=54 default charset=utf8;

create table user(
	UserId int auto_increment,
	UserName char(12) not null,
	UserPassword char(16) not null,
	UserMail char(50) not null,
	UserRealName char(16) not null,
	SexId int not null,
	UserFlag char(10) not null,
	primary key (UserId),
	constraint user_sex foreign key (SexId) references sex (SexId) on delete cascade on update cascade
)engine=InnoDB auto_increment=54 default charset=utf8;

create table UserInfo(
	UserInfoId int auto_increment,
	UserInfoAddress char(100) not null,
	UserInfoTel char(20) not null,
	UserInfoMovPhone char(20) not null,
	UserInfoSendDate date not null,
	UserId int not null,
	primary key (UserInfoId),
	constraint userinfo_user foreign key (UserId) references user (UserId) on delete cascade on update cascade
)engine=InnoDB auto_increment=54 default charset=utf8;

create table Menu(
	MenuId int auto_increment,
	MenuName char(100) not null,
	MenuContent char(200) ,
	MenuPrice decimal(6,2) not null, 
	primary key (MenuId)
)engine=InnoDB auto_increment=54 default charset=utf8;

create table orders(
	OrdersId int auto_increment,
	OrdersNum int not null,
	OrdersNotice char(200),
	MenuId int not null,
	UserId int not null,
	OrdersStatus int not null,
	OrdersDate date not null,
	primary key(OrdersId),
	constraint orders_menu foreign key(MenuId) references Menu(MenuId) ,
	constraint orders_user foreign key(UserId) references User(UserId) 
)engine=InnoDB auto_increment=54 default charset=utf8;

create table MenuList(
	MenuListId int  auto_increment,
	MenuListName char(50) not null,
	MenuListCount int not null,
	MenuListPrice decimal(6,2) not null,
	MenuListTotal decimal(10,2) not null,
	MenuListContent char(200) ,
	OrdersId int not null,
	UserId int not null,
	MenuListSendName char(50) not null,
	MenuListSendTel char(20) not null,
	MenuListSendTime date not null,
	MenuListState int not null,
	primary key(MenuListId),
	constraint menulist_order foreign key(OrdersId) references Orders(OrdersId) on delete cascade on update cascade,
	constraint menulist_user foreign key(UserId) references User(UserId) on delete cascade on update cascade
)engine=InnoDB auto_increment=54 default charset=utf8;