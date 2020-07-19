package org.decorator;

public class Mac extends Notebook {

    public Mac(String display, String ram, String cpu) {
        super(display, ram, cpu);
    }

    @Override
    public String getDescription() {
        return "Mac";
    }

    @Override
    public int getPrice() {
        return 250000;
    }
}
