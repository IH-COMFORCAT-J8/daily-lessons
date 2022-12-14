drop schema if exists students;
create schema students;
use students;

-- Así se añaden comentarios
-- borrar tabla
-- drop table course;


-- crear tabla
create table course(
course_id VARCHAR(6),
course_name VARCHAR(255),
primary key (course_id)
);

create table section(
section_id VARCHAR(8),
course_code VARCHAR(6),
room_number INT,
professor VARCHAR(255),
primary key (section_id),
foreign key (course_code) references course(course_id)
);

create table grade(
id INT AUTO_INCREMENT,
student_name VARCHAR(255),
course_code VARCHAR(8),
grade int,
primary key (id),
foreign key (course_code) references section(section_id)
);

INSERT INTO course(course_id, course_name) VALUES
("CS101", "Intro to Java"),
("CS103", "Databases");

INSERT INTO section VALUES
("CS101-A", "CS101", 1802, "Balderez"),
('CS101-B', 'CS101',  1650, 'Su'),
('CS103-A', 'CS103',  1200, 'Rojas'),
('CS103-B', 'CS103',  1208, 'Tonno');

INSERT INTO grade(student_name, course_code, grade) VALUES
("Maya Charlotte", "CS101-A", 98),
('James Fields', 'CS101-A', 82),
('Michael Alcocer', 'CS101-B', 65),
('Maya Charlotte', 'CS103-A', 89),
('Tomas Lacroix', 'CS101-A', 99),
('Sara Bisat', 'CS101-A', 87),
('James Fields', 'CS101-B', 46),
('Helena Sepulvida', 'CS103-A', 72);


-- select
 
 select * from grade;
 select count(*) from grade;
 
 -- Mostrar el número de notas que tenemos por sección
 select course_code, count(*) from grade group by course_code;
 
 -- Mostrar la nota media por sección
 select course_code, avg(grade) from grade group by course_code;
 
 -- sumar todas las notas por course_code
 select course_code, sum(grade) from grade group by course_code;
 
 -- extraer la nota máxima y mínima de cada course_code
 select course_code, max(grade) from grade group by course_code;
 
 select course_code, min(grade) from grade group by course_code;
 
 
 -- LIKE
 
select * from grade where course_code like "CS101%";
select * from grade where course_code like "%-A";
select * from grade where course_code like "%101%";

select * from grade where grade > 50 and grade <= 72;
-- esto equivale
select * from grade where grade between 50 and 72;

-- podemos mezclar
select * from grade where student_name LIKE "M%" or grade > 95;

select distinct student_name from grade;

 -- the average grade by student.
 
 select student_name, avg(grade) from grade group by student_name;
 
 -- the total number of courses taken by each student
 
 select student_name, count(course_code) from grade group by student_name;
 
 -- the minimum grade by section
 
 select course_code, min(grade) from grade group by course_code; 
 
 -- the maximum grade by section
 
 select course_code, max(grade) from grade group by course_code;
 
 -- the total number of courses taken by a student who has more than 1 course taken
 
 select student_name, count(course_code) from grade group by student_name having count(course_code) > 1;
 
 -- student name and score for all CS103 sections sorted by the score from highest to lowest.
 
 select student_name, grade from grade where course_code like "CS103%" order by grade desc;
 
 -- an alphabetical list of distinct students whose first names fall alphabetically from L to R
 select distinct student_name from grade where student_name between 'L' and 'R' order by student_name asc;
 
 
 select * from grade;

-- Joins 

select s.course_code, s.room_number, c.course_name, s.professor 
from section s join course c on s.course_code = c.course_id;

-- Join de más de una tabla

use students;
select g.student_name, g.grade, c.course_name, s.professor 
from grade g join section s on g.course_code = s.section_id join course c on s.course_code = c.course_id;

-- solucion ejercicio joins

select g.student_name, g.grade 
from grade g 
join section s on g.course_code = s.section_id 
join course c on s.course_code = c.course_id 
where c.course_name = 'Databases';




