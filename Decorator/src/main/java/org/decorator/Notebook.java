package org.decorator;

public abstract class Notebook implements INotebook {

    private String display;
    private String ram;
    private String cpu;

    public Notebook(String display, String ram, String cpu) {
        this.display = display;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "display='" + display + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
