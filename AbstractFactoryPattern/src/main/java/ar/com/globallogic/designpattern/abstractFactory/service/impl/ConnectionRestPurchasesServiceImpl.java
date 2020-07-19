package ar.com.globallogic.designpattern.abstractFactory.service.impl;

import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionRestService;

public class ConnectionRestPurchasesServiceImpl implements ConnectionRestService {
    @Override
    public void readUrl() {
        System.out.println("Conectandose a: https://www.Purchases.com");
    }
}
