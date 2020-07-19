package org.example.promotion;

public class PhonePromotions extends SubscribedPromotion{
    private String name;
    private int cost;
    private String dateValidity;

    public PhonePromotions(Client client){
        this.client = client;
        this.client.add(this);
        this.name = "20 numeros amigos";
        this.cost = 100;
        this.dateValidity = "10 meses";
    }
    @Override
    public void updatePromotion() {
        System.out.println("Te ofrecemos " +  name + " a tan solo "+ cost + " pesos por "+ dateValidity);
    }
}
