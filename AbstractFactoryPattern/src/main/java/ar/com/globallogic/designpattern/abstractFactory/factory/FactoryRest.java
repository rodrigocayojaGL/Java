package ar.com.globallogic.designpattern.abstractFactory.factory;

import ar.com.globallogic.designpattern.abstractFactory.service.AbstractFactory;
import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionRestService;
import ar.com.globallogic.designpattern.abstractFactory.service.impl.ConnectionRestNoAreaServiceImpl;
import ar.com.globallogic.designpattern.abstractFactory.service.impl.ConnectionRestPurchasesServiceImpl;
import ar.com.globallogic.designpattern.abstractFactory.service.impl.ConnectionRestSalesServiceImpl;

public class FactoryRest implements AbstractFactory<ConnectionRestService> {

    private static final String SALES = "SALES";
    private static final String PURCHASES = "PURCHASES";
    
    @Override
    public ConnectionRestService getType(String type) {
        switch (type.toUpperCase()) {
            case SALES: return new ConnectionRestSalesServiceImpl();
            case PURCHASES: return new ConnectionRestPurchasesServiceImpl();
            default:  return new ConnectionRestNoAreaServiceImpl();
        }
    }
}
