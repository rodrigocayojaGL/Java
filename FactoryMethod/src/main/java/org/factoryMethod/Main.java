package org.factoryMethod;

public class Main
{
    public static void main( String[] args )
    {
        final ShapeFactory shapeFactory = new ShapeFactory();

        final IShape square = shapeFactory.getShape(Shape.SQUARE);
        final IShape rectangle = shapeFactory.getShape(Shape.RECTANGLE);
        final IShape rhombus = shapeFactory.getShape(Shape.RHOMBUS);

        System.out.println("Square: " + square.getPerimeter());
        System.out.println("Rectangle: " + rectangle.getPerimeter());
        System.out.println("Rhombus: " + rhombus.getPerimeter());
    }
}
