create database projectdb;

use projectdb;

create table location (
	id int PRIMARY KEY,
    code varchar(20),
    name varchar(20),
    type varchar(10)
);

select * from location;

drop table location;

-- Below code for the location_table;

create table location_table (
	id int primary key auto_increment,
    code varchar(20),
    name varchar(20),
    type varchar(20)
);

select * from location_table;