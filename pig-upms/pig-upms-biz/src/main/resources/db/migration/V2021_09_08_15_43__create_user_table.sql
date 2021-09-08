create table u_user
(
    id int auto_increment,
    user_name varchar(20) not null,
    mobile varchar(20) not null,
    password varchar(64) not null,
    wechat_id varchar(64) null,
    created_time datetime default CURRENT_TIMESTAMP,
    updated_time datetime default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    constraint u_user_pk
        primary key (id)
)
    comment '用户表';

create unique index u_user_mobile_uindex
	on u_user (mobile);

create index u_user_user_name_uindex
	on u_user (user_name);

create unique index u_user_wechat_id_uindex
	on u_user (wechat_id);