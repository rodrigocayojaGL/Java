package org.example.promotion;

public class InternetPromotions extends SubscribedPromotion{
    private String name;
    private int cost;
    private String dateValidity;

    public InternetPromotions(Client client){
        this.client = client;
        this.client.add(this);
        this.name = "50 Megas";
        this.cost = 400;
        this.dateValidity = "8 meses";
    }
    @Override
    public void updatePromotion() {
        System.out.println("Te ofrecemos " +  name + " a tan solo "+ cost + " pesos por "+ dateValidity);
    }
}
