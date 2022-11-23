drop schema if exists lab302;
create schema lab302;
use lab302;

create table aircraft(
model varchar(255),
seats int,
primary key(model)
);

create table customer(
id int auto_increment,
name varchar(255),
customer_status enum("GOLD", "SILVER", "NONE"),
primary key(id)
);

create table flight(
number varchar(255),
mileage bigint,
aircraft varchar(255),
primary key(number)
);



