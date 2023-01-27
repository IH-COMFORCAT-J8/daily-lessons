create schema hogwarts;
use hogwarts;
drop table student;
create table student(
id BIGINT AUTO_INCREMENT,
first_name VARCHAR(55),
last_name VARCHAR(55),
address VARCHAR(255),
postal_code INT,
city VARCHAR(55),
country VARCHAR(255),
physical_address VARCHAR(255),
physical_postal_code INT,
physical_city VARCHAR(55),
physical_country VARCHAR(55),
primary key (id)
);

select * from assignment;

drop table assignment;

create table final_assignment(
id BIGINT auto_increment,
student_id BIGINT,
name varchar(255),
score int,
primary key (id),
foreign key (student_id) references student(id)
);

create table lab(
id BIGINT auto_increment,
student_id bigint,
name varchar(255),
score int,
primary key (id),
foreign key (student_id) references student(id));

create table spell(
id INT auto_increment,
name varchar(55),
level int,
primary key(id));

create table student_casts_spells(
student_id BIGINT,
spell_id INT,
foreign key (student_id) references student(id),
foreign key (spell_id) references spell(id));

select * from final_assignment;