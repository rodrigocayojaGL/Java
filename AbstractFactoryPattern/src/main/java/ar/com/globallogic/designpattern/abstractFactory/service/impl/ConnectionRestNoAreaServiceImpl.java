package ar.com.globallogic.designpattern.abstractFactory.service.impl;

import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionRestService;

public class ConnectionRestNoAreaServiceImpl implements ConnectionRestService {
    @Override
    public void readUrl() {
        System.out.println("AREA NO ELEGIDA");
    }
}
