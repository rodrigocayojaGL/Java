package org.decorator;

public abstract class NoteBookDecorator implements INotebook {
    private  INotebook iNotebook;

    public NoteBookDecorator(INotebook iNotebook) {
        this.iNotebook = iNotebook;
    }

    public INotebook getiNotebook() {
        return iNotebook;
    }

    public void setiNotebook(INotebook iNotebook) {
        this.iNotebook = iNotebook;
    }
}
