package com.java.padroesprojeto.controller;

import com.java.padroesprojeto.model.Cliente;
import com.java.padroesprojeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> listar(){
        return ResponseEntity.ok(clienteService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente cliente){
        clienteService.novoCliente(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Cliente cliente, @RequestBody Long id){
        clienteService.atualizarCliente(cliente, id);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping
    public ResponseEntity<Void> apagarCliente(@PathVariable Long id) {
        clienteService.apagarCliente(id);
        return ResponseEntity.ok().build();
    }
}
