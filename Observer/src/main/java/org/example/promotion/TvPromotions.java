package org.example.promotion;

public class TvPromotions extends SubscribedPromotion{
    private String name;
    private int cost;
    private String dateValidity;

    public TvPromotions(Client client){
        this.client = client;
        this.client.add(this);
        this.name = "10 canales de HBO";
        this.cost = 100;
        this.dateValidity = "6 meses";
    }
    @Override
    public void updatePromotion() {
        System.out.println("Te ofrecemos " +  name + " a tan solo "+ cost + " pesos por "+ dateValidity);
    }
}
