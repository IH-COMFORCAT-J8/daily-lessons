drop schema if exists lab302;
create schema lab302;
use lab302;

create table author(
id int auto_increment,
name varchar(255),
primary key(id)
);

create table blog_post(
id int auto_increment,
title varchar(255),
word_count int,
views int,
author_id int,
primary key(id),
foreign key (author_id) references author (id)
);

INSERT INTO author(name) VALUES
("Maria Charlotte"),
("Juan Perez"),
("Gemma Alcocer");


INSERT INTO blog_post (author_id, title, word_count, views) VALUES
(1, "Best Paint Colors", 814, 14),
(2, "Small Space Decorating Tips", 1146, 221),
(1, "Hot Accessories", 986, 105),
(1, "Mixing Textures", 765, 22),
(2, "Kitchen Refresh", 1242, 307),
(1, "Homemade Art Hacks", 1002, 193),
(3, "Refinishing Wood Floors", 1571, 7542);
