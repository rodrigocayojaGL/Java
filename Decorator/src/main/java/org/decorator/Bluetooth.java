package org.decorator;

public class Bluetooth extends NoteBookDecorator {

    public Bluetooth(INotebook iNotebook) {
        super(iNotebook);
    }

    @Override
    public String getDescription() {
        return getiNotebook().getDescription() + " + Bluetooth";
    }

    @Override
    public int getPrice() {
        return getiNotebook().getPrice() + 1000;
    }
}
