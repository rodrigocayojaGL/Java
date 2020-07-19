package ar.com.globallogic.designpattern.abstractFactory.factory;

import ar.com.globallogic.designpattern.abstractFactory.service.AbstractFactory;

public class FactoryProvider {

    private static final String BD = "BD";
    private static final String REST = "REST";
    public static AbstractFactory getFactory(String typeFactory) {

        switch (typeFactory.toUpperCase()) {
            case BD: return new FactoryBD();
            case REST: return new FactoryRest();
            default: return null;
        }
    }
}
