package com.ironhack.IHJavaWeek4Day1;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.ironhack.IHJavaWeek4Day1.models.*;
import com.ironhack.IHJavaWeek4Day1.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.http.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.setup.*;
import org.springframework.web.context.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class ProductControllerTest {

    //WebApplicationContext: lo necesita MockMvc para realizar las peticiones
    @Autowired
    private WebApplicationContext context;

    @Autowired
    private ProductRepository productRepository;

    //MockMvc: Nos sirve para falsear peticiones http
    MockMvc mockMvc;

    //ObjectMapper: Convierte objetos a formato json
    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        //Construimos el falseador, introduciendo el contexto de la app
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    void commandLineRunnerRuns() {
        assertEquals(5, productRepository.findAll().size());
    }

    @Test
    void shouldAddNewSeller_whenPostIsPerformed() throws Exception {
        Seller seller = new Seller("Jaume", "Mi direccion");
        //Convertimos el objeto a formato json
        String body = objectMapper.writeValueAsString(seller);
        /*
        Método perform: realiza una llamada http
        Método content: añade contenido (json) al request body
        Método contentType: define el tipo de contenido APPLICATION_JSON
        Método andExpect: Espera un determinado response status
        Método return: finaliza la llamada

        // {
        //    "name": "Jaume",
        //    "address": "Ejemplo"
        //}

         */
        MvcResult result = mockMvc.perform(post("/products/add-seller").content(body).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated()).andReturn();

        assertTrue(result.getResponse().getContentAsString().contains("Jaume"));
    }
}
