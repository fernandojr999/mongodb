package com.example.mongodb.mongodb;

import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(clienteRepository.findAll());
    }

    @PostMapping
    public void save(){
        Cliente cliente = Cliente.builder().id("10236307967").razaoSocial("Fernando Junior").build();
        clienteRepository.save(cliente);
    }
}
