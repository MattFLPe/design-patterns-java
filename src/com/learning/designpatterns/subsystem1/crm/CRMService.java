package com.learning.designpatterns.subsystem1.crm;

public class CRMService {
    private CRMService() {
        super();
    }
    public static void registerClient(String name, String cep, String city) {
        System.out.println("Client successfully registered in the CRM system.");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
    }
}
