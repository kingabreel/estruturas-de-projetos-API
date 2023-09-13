package com.java.facade.sistemaInterno;

public class CrmService {
    private CrmService(){}
    public static void salvarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo");
    }
}
