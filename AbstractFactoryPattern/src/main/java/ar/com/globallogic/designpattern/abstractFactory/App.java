package ar.com.globallogic.designpattern.abstractFactory;

import ar.com.globallogic.designpattern.abstractFactory.factory.FactoryProvider;
import ar.com.globallogic.designpattern.abstractFactory.service.AbstractFactory;
import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionBDService;
import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionRestService;

public class App {

    public static void main(String[] args) {

        // Seleccionamos la fabrica
        final AbstractFactory factoryBD = FactoryProvider.getFactory("BD");
        // Seleccionamos el tipo de BD
        final ConnectionBDService oracle = (ConnectionBDService) factoryBD.getType("Mysql");
        // Metodos propios de esa instancia
        oracle.connect();

        // Seleccionamos la fabrica
        final AbstractFactory factoryRest = FactoryProvider.getFactory("REST");
        // Seleccionamos la Api
        final ConnectionRestService sales = (ConnectionRestService) factoryRest.getType("purchases");
        // Metodos propios de esa instancia
        sales.readUrl();

    }
}
