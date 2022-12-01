package com.ironhack.lab402;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class Lab402ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	private final ObjectMapper objectMapper = new ObjectMapper();

	@BeforeEach
	void setUp(){
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		//objectMapper.findAndRegisterModules();
	}

	@Test
	void find_all_employees() throws Exception {
		MvcResult result = mockMvc.perform(get("/employees"))
				.andExpect(status().isOk()).andReturn();
		assertEquals(employeeRepository.findAll().size(), result.getResponse().getContentAsString().split("},").length);
	}

	@Test
	void find_employee_OK() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/employees/156545"))
				.andExpect(status().isOk()).andReturn();

		assertTrue(result.getResponse().getContentAsString().contains("Paolo Rodriguez"));

	}

	@Test
	void find_employee_FAIL() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/employees/000000"))
				.andExpect(status().isNotFound()).andReturn();
		assertEquals("The user does not exist", result.getResponse().getErrorMessage());
	}

	@Test
	void create_employee() throws Exception {
		Employee employee1 = new Employee(666666L, "BLABLA", "Alejandro", Status.ON_CALL);
		String body = objectMapper.writeValueAsString(employee1);

		MvcResult result = mockMvc.perform(post("/create-doctor")
				.content(body).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated()).andReturn();

		assertTrue(result.getResponse().getContentAsString().contains("Alejandro"));

	}

	@Test
	void patch_employee_OK() throws Exception {
		MvcResult result = mockMvc.perform(patch("/doctor-department/156545")
				.param("department", "TEST")).andExpect(status().isAccepted()).andReturn();

		assertTrue(result.getResponse().getContentAsString().contains(employeeRepository.findById(156545L).get().getDepartment()));
	}

}
