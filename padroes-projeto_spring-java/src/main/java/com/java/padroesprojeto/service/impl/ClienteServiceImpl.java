package com.java.padroesprojeto.service.impl;

import com.java.padroesprojeto.model.Cliente;
import com.java.padroesprojeto.model.ClienteRepository;
import com.java.padroesprojeto.model.Endereco;
import com.java.padroesprojeto.model.EnderecoRepository;
import com.java.padroesprojeto.service.ClienteService;
import com.java.padroesprojeto.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository cliRepository;
    @Autowired
    private EnderecoRepository endRepository;
    @Autowired
    ViaCepService viaCep;
    @Override
    public Iterable<Cliente> listar() {
        return cliRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = cliRepository.findById(id);
        return cliente.get();
    }
    @Override
    public void novoCliente(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizarCliente(Cliente cliente, Long id) {
        Optional<Cliente> clienteBd = cliRepository.findById(id);
        if (clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void apagarCliente(Long id) {
        cliRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cepId = cliente.getEndereco().getCep();
        Endereco endereco = endRepository.findById(cepId).orElseGet(() -> {
            Endereco novoEndereco = viaCep.consultarCep(cepId);
            endRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);

        cliRepository.save(cliente);
    }
}
