create database test;
use test;
create table users(
	id int auto_increment primary key,
    name varchar(255) not null,
    mobile char(13),
    email varchar(255),
    address varchar(255)
    
)