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





