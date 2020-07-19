package org.example.promotion;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<SubscribedPromotion> observers = new ArrayList<>();
    private String plan;
    private String name;
    private String surname;
    private int amount;

    public Client(String plan, String name, String surname, int amount){
        this.plan = plan;
        this.name = name;
        this.surname = surname;
        this.amount = amount;
    }

    public String getPlan(){
        return this.plan;
    }
    public void setPlan(String plan, int amount){
        this.plan = plan;
        this.amount = amount;
        notifyObservers();
    }

    public void add(SubscribedPromotion promotion){
        this.observers.add(promotion);
    }

    public void delete(SubscribedPromotion promotion){
        this.observers.remove(promotion);
    }

    public void notifyObservers(){
        this.observers.forEach(x -> x.updatePromotion());
    }


}
