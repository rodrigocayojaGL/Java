package org.builder;

public class Main
{
    public static void main( String[] args )
    {
        final HeroBuilder heroBuilder = new HeroBuilder();

        final Hero hero = heroBuilder
                .name("Spartacus")
                .hairColor("black")
                .armor("shield")
                .weapon("blade")
                .builder();

        System.out.println(hero.toString());
    }
}
