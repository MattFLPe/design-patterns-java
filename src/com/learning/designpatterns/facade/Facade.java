package com.learning.designpatterns.facade;

import com.learning.designpatterns.subsystem1.crm.CRMService;
import com.learning.designpatterns.subsystem2.cep.CepApi;

public class Facade {
    public void clientMigrate(String name, String cep) {
        String city = CepApi.getInstance().getCity(cep);
        CRMService.registerClient(name, cep, city);
    }
}
