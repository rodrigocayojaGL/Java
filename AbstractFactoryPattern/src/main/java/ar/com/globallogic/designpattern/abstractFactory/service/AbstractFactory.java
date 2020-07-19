package ar.com.globallogic.designpattern.abstractFactory.service;

public interface AbstractFactory<T> {

    T getType(String type) ;
}
