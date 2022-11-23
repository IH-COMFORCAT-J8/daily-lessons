package com.example.demo;

import com.example.demo.models.Aircraft;
import com.example.demo.models.Customer;
import com.example.demo.models.CustomerStatus;
import com.example.demo.models.Flight;
import com.example.demo.repositories.AircraftRepository;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.FlightRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Lab304ApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AircraftRepository aircraftRepository;

	@Autowired
	FlightRepository flightRepository;


	@Test
	void create_customer_OK() {
		Customer customer = customerRepository.save(new Customer("Alejandro", CustomerStatus.NONE));
		Customer customerResponse = customerRepository.findById(customer.getId()).get();
		assertTrue(customer.equals(customerResponse));
	}

	@Test
	void create_aircraft_OK(){

		Aircraft aircraft = aircraftRepository.save(new Aircraft("Boeing747", 300));
		Aircraft aircraftResponse = aircraftRepository.findById(aircraft.getModel()).get();
		assertTrue(aircraft.equals(aircraftResponse));
	}

	@Test
	void create_flight_OK(){
		Flight flight = flightRepository.save(new Flight("JK478", 2000L, "Boeing747"));
		Flight flightResponse = flightRepository.findById(flight.getNumber()).get();
		assertTrue(flight.equals(flightResponse));
	}

	@Test
	void find_customer_byName_OK(){
		Customer customer = new Customer("Raul", CustomerStatus.GOLD);
		customerRepository.save(customer);
		assertTrue(customerRepository.findByName("Raul").isPresent());
	}

	@Test
	void find_by_Status_OK(){
		assertEquals(2, customerRepository.findByCustomerStatus(CustomerStatus.NONE).size());
	}

	@Test
	void find_flight_by_number_OK(){
		Flight flight = flightRepository.save(new Flight("HM781", 30000L, "Boeing888"));
		Flight flightResponse = flightRepository.findById(flight.getNumber()).get();
		assertTrue(flight.equals(flightResponse));
	}

	@Test
	void find_by_name_containing_OK(){
		Aircraft aircraft = aircraftRepository.save(new Aircraft("Boeing748", 300));
		Aircraft aircraft2 = aircraftRepository.save(new Aircraft("Airbus", 100));
		assertEquals(2, aircraftRepository.findByModelContaining("Boeing").size());

	}

	@Test
	void find_by_mileage_graterThan_OK(){
		assertEquals(2, flightRepository.findByMileageGreaterThan(1000L).size());
	}







}
