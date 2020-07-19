package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Promotion extends PlanStructure {
    private static final String SEPARATOR = ", ";

    private List<PlanStructure> plans = new ArrayList<>();

    public Promotion(String name, double price) {
        super(name, price);
    }

    public void add(PlanStructure plan){
        this.plans.add(plan);
    }
    public void remove(PlanStructure plan){
        this.plans.remove(plan);
    }

    @Override
    public double getPrice() {
        double price = 0;
        for(PlanStructure plan : plans){
            price += plan.getPrice();
        }
        return price;
    }

    public double getPriceWithDiscount(){
        return this.price;
    }

    public String getPlans(){
        String planlist = "lista: ";
        for(PlanStructure plan : plans){
            planlist += plan.getNAme()+ SEPARATOR;
        }
        //Ajuste mensaje
        planlist = planlist.replace(", , ",",");
        planlist = planlist.substring(0,planlist.length()-2);

        return planlist;
    }
    @Override
    public String getNAme(){
        String planlist = " ";
        for(PlanStructure plan : plans){
            planlist += plan.getNAme()+ SEPARATOR;
        }
        return planlist;
    }
}
