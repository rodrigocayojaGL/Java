package org.builder;

public class HeroBuilder implements IBuilder {
    private String name;
    private String hairColor;
    private String armor;
    private String weapon;

    public HeroBuilder() {
    }

    public HeroBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HeroBuilder hairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public HeroBuilder armor(String armor) {
        this.armor = armor;
        return this;
    }

    public HeroBuilder weapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public Hero builder() {
        final Hero hero = new Hero();
        hero.setName(this.name);
        hero.setHairColor(this.hairColor);
        hero.setArmor(this.armor);
        hero.setWeapon(this.weapon);
        return hero;
    }
}
