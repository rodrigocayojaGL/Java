package org.example;

import org.example.promotion.Client;
import org.example.promotion.InternetPromotions;
import org.example.promotion.PhonePromotions;
import org.example.promotion.TvPromotions;

/**
 * Demo patron Observer
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client cliente1 = new Client("Basic","Diego", "Aredes",800);
        new InternetPromotions(cliente1);
        new PhonePromotions(cliente1);
        new TvPromotions(cliente1);

        //ACTUALIZO EL PLAN DEL CLIENTE
        cliente1.setPlan("Medium",1600);

    }
}
