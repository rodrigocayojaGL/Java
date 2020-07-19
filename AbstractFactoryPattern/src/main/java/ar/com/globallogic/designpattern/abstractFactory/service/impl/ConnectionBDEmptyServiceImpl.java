package ar.com.globallogic.designpattern.abstractFactory.service.impl;

import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionBDService;

public class ConnectionBDEmptyServiceImpl implements ConnectionBDService {
    @Override
    public void connect() {
        System.out.println("NO SE ESPECIFICA EL PROVEEDOR");
    }

    @Override
    public void disconnect() {
        System.out.println("NO SE ESPECIFICA EL PROVEEDOR");
    }
}
