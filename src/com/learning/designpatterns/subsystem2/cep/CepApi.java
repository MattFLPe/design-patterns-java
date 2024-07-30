package com.learning.designpatterns.subsystem2.cep;
public class CepApi {
    private static CepApi instance = new CepApi();
    private CepApi() {
        super();
    }
    public static CepApi getInstance() {
        return instance;
    }
    public String getCity(String cep) {
        return "São Paulo";
    }
}
