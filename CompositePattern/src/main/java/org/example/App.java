package org.example;

/**
 * Demo composite
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Patron composite");

        /*
        Cargo los planes
         */
        Plan planA = new Plan("Economico TV",500,"1/1/2020","30/12/2020","TV");
        Plan planB = new Plan("Economico Internet",700,"1/1/2020","30/12/2020","Internet");
        Plan planC = new Plan("Economico Telefonía",500,"1/1/2020","30/12/2020","Telefonía");
        Plan planD = new Plan("prime 1",500,"5/1/2019","5/12/2025","TV");
        Plan planE = new Plan("gold",1000,"1/1/2015","30/6/2020","TV");

        /*
        Cargo las promociones
         */
        Promotion promotion1 = new Promotion("inicial ",1400);
        promotion1.add(planA);
        promotion1.add(planB);
        promotion1.add(planC);

        Promotion promotion2 = new Promotion("gold ",2400);
        promotion2.add(promotion1);
        promotion2.add(planE);
        /*
        Muestro una promocion compuesto de planes
         */

        System.out.println("la promocion "+promotion1.name + " cuesta "+ promotion1.getPrice()+
                " pesos y esta compuesto por los planes " +  promotion1.getPlans() );

         /*
        Muestro una promocion compuesto por una promocion y un plan
         */
        System.out.println("la promocion "+promotion2.name + " cuesta "+ promotion2.getPrice()+
                " pesos y esta compuesto por los planes " +  promotion2.getPlans() );
    }
}
