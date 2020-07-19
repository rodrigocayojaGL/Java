package ar.com.globallogic.designpattern.abstractFactory.factory;

import ar.com.globallogic.designpattern.abstractFactory.service.AbstractFactory;
import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionBDService;
import ar.com.globallogic.designpattern.abstractFactory.service.impl.ConnectionBDEmptyServiceImpl;
import ar.com.globallogic.designpattern.abstractFactory.service.impl.ConnectionBDMySqlServiceImpl;
import ar.com.globallogic.designpattern.abstractFactory.service.impl.ConnectionBDOracleServiceImpl;

public class FactoryBD implements AbstractFactory<ConnectionBDService> {
    private static final String MY_SQL = "MYSQL";
    private static final String ORACLE = "ORACLE";

    @Override
    public ConnectionBDService getType(String type) {
        switch (type.toUpperCase()) {
            case MY_SQL:
                return new ConnectionBDMySqlServiceImpl();
            case ORACLE:
                return new ConnectionBDOracleServiceImpl();
            default:
                return new ConnectionBDEmptyServiceImpl();
        }
    }

}
