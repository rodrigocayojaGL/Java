package org.example;

public abstract class PlanStructure {
    protected String name;
    protected double price;

    public PlanStructure(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getNAme(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
}
