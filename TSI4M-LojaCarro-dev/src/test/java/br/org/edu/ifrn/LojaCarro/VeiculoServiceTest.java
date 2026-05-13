package br.org.edu.ifrn.LojaCarro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class VeiculoFeatureTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testeCadastroVeiculo() throws Exception {
        
        mockMvc.perform(get("/carro")
                .contentType("application/json")
                .content("{\"marca\":\"Fiat\", \"modelo\":\"Uno\", \"ano\":2010}"))
                .andExpect(status().isOk()); 
    }

    @Test
    void testeBuscaVeiculos() throws Exception {
        mockMvc.perform(get("/teste"))
                .andExpect(status().isOk());
    }

    @Test
    void testeLogin() throws Exception {
        // Simula um Login
        mockMvc.perform(post("/login")
                .contentType("application/json")
                .content("{\"username\":\"admin\", \"password\":\"123\"}"))
                .andExpect(status().isOk());
    }
}