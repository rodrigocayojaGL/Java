package ar.com.globallogic.designpattern.abstractFactory.service.impl;

import ar.com.globallogic.designpattern.abstractFactory.service.ConnectionBDService;

public class ConnectionBDMySqlServiceImpl implements ConnectionBDService {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnectionBDMySqlServiceImpl() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "Mysql";
        this.contrasena = "123";
    }


    @Override
    public void connect() {
        System.out.println("Se conecta a MySQL");
        System.out.println("ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
                + contrasena + "]");
    }

    @Override
    public void disconnect() {
        System.out.println("Se desconecta de MySQL");
    }
}
