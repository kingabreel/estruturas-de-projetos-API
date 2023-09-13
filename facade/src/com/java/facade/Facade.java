package com.java.facade;

import com.java.facade.outroSistemaInterno.CepApi;
import com.java.facade.sistemaInterno.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().Cidade(cep);
        String estado = CepApi.getInstance().Estado(cep);

        CrmService.salvarCliente(nome, cep, cidade, estado);
    }
}
