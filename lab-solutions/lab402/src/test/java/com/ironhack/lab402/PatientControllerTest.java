package com.ironhack.lab402;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class PatientControllerTest {
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
    void create_patient() throws Exception {
        Patient patient = new Patient(6L, "Rosi", LocalDate.of(2000, 01, 01), null);
        String body = objectMapper.writeValueAsString(patient);
        MvcResult result = mockMvc.perform(post("/create-patient")
                .content(body).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated()).andReturn();

        assertTrue(result.getResponse().getContentAsString().contains("Rosi"));
    }

    @Test
    void update_patient() throws Exception {
        Patient patient = new Patient(1L, "Alejandro", LocalDate.of(2000,01,2), null);
        String body = objectMapper.writeValueAsString(patient);
        MvcResult result = mockMvc.perform(put("/update-patient")
                .content(body).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isAccepted()).andReturn();
        assertTrue(result.getResponse().getContentAsString().contains("Alejandro"));

    }

    @Test
    void update_patient_fail() throws Exception {
        Patient patient = new Patient(9999L, "Alejandro", LocalDate.of(2000,01,2), null);
        String body = objectMapper.writeValueAsString(patient);
        MvcResult result = mockMvc.perform(put("/update-patient")
                        .content(body).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound()).andReturn();
        assertTrue(result.getResponse().getErrorMessage().equals("The patient does not exist"));
    }
}
