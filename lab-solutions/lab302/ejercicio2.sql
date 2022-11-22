drop schema if exists lab302;
create schema lab302;
use lab302;

create table status(
id int auto_increment,
status varchar(10),
primary key(id)
);

create table customer(
id int auto_increment,
name varchar(255),
status_id int,
customer_mileage int,
primary key(id),
foreign key (status_id) references status (id)
);

create table aircraft(
model VARCHAR(255),
seats int,
primary key(model)
);

create table flight(
flight_number varchar(10),
aircraft_model VARCHAR(255),
flight_mileage int,
primary key(flight_number),
foreign key(aircraft_model) references aircraft(model)
);

create table customer_flight(
id int auto_increment,
customer_id int,
flight_number varchar(10),
primary key(id),
foreign key(customer_id) references customer(id),
foreign key(flight_number) references flight (flight_number)
);

INSERT INTO status(status) VALUES
("Gold"),
("Silver"),
("None");

INSERT INTO customer(name, status_id, customer_mileage) VALUES
("Agustine Riviera", 2, 115235),
("Alaina Sepulvida", 3, 6008),
("Tom Jones", 1, 205767),
("Sam Rio", 3, 2653),
("Jessica James", 2, 127656),
("Ana Janco", 2, 136773),
("Jennifer Cortez", 1, 300582),
("Christian Janco", 2, 14642);

INSERT INTO aircraft VALUES
("Boeing 747", 400),
("Airbus A330", 236),
("Boeing 777", 264);

INSERT INTO flight(flight_number, flight_mileage, aircraft_model) VALUES
('DL143', 135, 'Boeing 747'),
('DL122', 4370, 'Airbus A330'),
('DL53', 2078, 'Boeing 777'),
('DL222', 1765, 'Boeing 777'),
('DL37', 531, 'Boeing 747');

INSERT INTO customer_flight(customer_id, flight_number) VALUES
(1, 'DL143'),
(1, 'DL122'),
(2, 'DL122'),
(1, 'DL143'),
(3, 'DL122'),
(3, 'DL53'),
(1, 'DL143'),
(4, 'DL143'),
(1, 'DL143'),
(3, 'DL222'),
(5, 'DL143'),
(4, 'DL143'),
(6, 'DL222'),
(7, 'DL222'),
(5, 'DL122'),
(4, 'DL37'),
(8, 'DL222');

/*In the Airline database write the SQL script to get the total number of flights in the database.*/

select count(*) from flight;

/* In the Airline database write the SQL script to get the average flight distance. */

select avg(flight_mileage) from flight;

/* In the Airline database write the SQL script to get the average number of seats. */

select avg(seats) from aircraft;

/* In the Airline database write the SQL script to get the average number of miles flown by customers grouped by status. */

select status_id, avg(customer_mileage) from customer group by status_id;

/* In the Airline database write the SQL script to get the maximum number of miles flown by customers grouped by status. */

select status_id, max(customer_mileage) from customer group by status_id;

/* In the Airline database write the SQL script to get the total number of aircraft with a name containing Boeing. */

select count(*) from aircraft where model like 'Boeing%';

/* In the Airline database write the SQL script to find all flights with a distance between 300 and 2000 miles. */

select flight_number from flight where flight_mileage between 300 and 2000;

/* In the Airline database write the SQL script to find the average flight distance booked grouped by customer status (this should require a join).*/

SELECT status_id, AVG(flight_mileage) from customer_flight
JOIN customer ON customer_flight.customer_id = customer.id
JOIN flight ON customer_flight.flight_number = flight.flight_number
GROUP BY customer.status_id;

/* In the Airline database write the SQL script to find the most often booked aircraft by gold status members (this should require a join). */

SELECT status_id, MAX(aircraft_model) from customer_flight
JOIN customer ON customer_flight.customer_id = customer.id
JOIN flight ON customer_flight.flight_number = flight.flight_number
WHERE customer.status_id = 1;