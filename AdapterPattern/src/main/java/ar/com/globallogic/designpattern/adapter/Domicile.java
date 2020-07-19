package ar.com.globallogic.designpattern.adapter;

public class Domicile {
    private String street;
    private int number;
    private String floor;
    private String flat;

    public Domicile(String street, int number, String floor, String flat) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getFloor() {
        return floor;
    }

    public String getFlat() {
        return flat;
    }


}
