package ar.com.globallogic.designpattern.abstractFactory.service.impl;

import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionBDService;

public class ConnectionBDOracleServiceImpl  implements ConnectionBDService {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnectionBDOracleServiceImpl() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "oracle";
        this.contrasena = "123";
    }

    @Override
    public void connect() {
        System.out.println("Se conecta a Oracle");
        System.out.println("ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
                + contrasena + "]");
    }

    @Override
    public void disconnect() {
        System.out.println("Se desconecta de Oracle");
    }

}
