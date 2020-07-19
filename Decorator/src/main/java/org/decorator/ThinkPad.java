package org.decorator;

public class ThinkPad extends Notebook {

    public ThinkPad(String display, String ram, String cpu) {
        super(display, ram, cpu);
    }

    @Override
    public String getDescription() {
        return "ThinkPad";
    }

    @Override
    public int getPrice() {
        return 150000;
    }
}
