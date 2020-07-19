package org.example;

public class Plan extends PlanStructure{

    protected String start;
    protected String end;
    protected String type;

    public Plan(String name, double price, String start, String end, String type) {
        super(name, price);
        this.end = end;
        this.start = start;
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
