drop database if exists mybatis_study;
create database mybatis_study character set utf8mb4;

use mybatis_study;

drop table if exists user;
create table user(
     id int primary key auto_increment,
     username varchar(20) not null unique comment '账号',
     password varchar(20) not null comment '密码'
) comment '用户表';

insert into user(username, password) values ('a1', '11');
insert into user(username, password) values ('a2', '12');
insert into user(username, password) values ('b', '2');
insert into user(username, password) values ('c', '3');
