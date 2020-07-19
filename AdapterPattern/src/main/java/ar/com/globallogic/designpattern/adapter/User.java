package ar.com.globallogic.designpattern.adapter;

public class User {
    String name;
    String surname;
    String addres;
    int age;
    private DomocileAdapter adapter;

    public final String SEPARATOR = ", ";

    public User(String name, String surname, int addres, int age,DomocileAdapter adapter) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adapter = adapter;
        this.addres = adapter.adaptDomicile(addres);

    }
    public String toString(){
        return this.name + SEPARATOR +  this.surname + SEPARATOR + this.age +  SEPARATOR +  this.addres;
    }

}
