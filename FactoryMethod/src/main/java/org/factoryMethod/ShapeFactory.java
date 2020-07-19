package org.factoryMethod;

public class ShapeFactory {

    public IShape getShape(final Shape shapeType) {
        switch (shapeType) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case RHOMBUS:
                return new Rhombus();
            default:
                return null;
        }
    }
}
