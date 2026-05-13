package br.org.edu.ifrn.LojaCarro.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {
    
    int count = 0;

    @RequestMapping("/teste") // Adicionada a barra para melhor prática
    public String teste() throws Exception {
        count++;
        if(count < 10) {
            return "bom dia";
        } else {
            throw new Exception("Excedeu o limite");
        }
    }

    
    @PostMapping("/login")
    public String login(@RequestBody String credentials) {
        // Simulação simplificada de login para validar o item 1 da sua atividade
        return "Login realizado com sucesso";
    }
}