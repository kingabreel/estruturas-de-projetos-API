package com.java.facade.outroSistemaInterno;

public class CepApi {
    private static CepApi api = new CepApi();

    private CepApi(){}

    public static CepApi getInstance(){
        return api;
    }

    public String Cidade(String cep){
        return "cidade dos anjos";
    }

    public String Estado(String cep){
        return "BA";
    }
}
