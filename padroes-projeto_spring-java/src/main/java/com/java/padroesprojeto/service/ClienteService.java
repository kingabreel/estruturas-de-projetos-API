package com.java.padroesprojeto.service;

import com.java.padroesprojeto.model.Cliente;
import com.java.padroesprojeto.model.ClienteRepository;

public interface ClienteService {
    Iterable<Cliente> listar();
    Cliente buscarPorId(Long id);
    void novoCliente(Cliente cliente);
    void atualizarCliente(Cliente cliente, Long id);
    void apagarCliente(Long id);
}
