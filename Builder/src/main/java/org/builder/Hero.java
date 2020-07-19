package org.builder;

public class Hero {
    private String name;
    private String hairColor;
    private String armor;
    private String weapon;

    public Hero() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", armor='" + armor + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
