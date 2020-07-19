package org.factoryMethod;

public class Rectangle implements IShape {

    private Double sideA;
    private Double sideB;
    private Double sideC;
    private Double sideD;

    public Rectangle() {
        this.sideA = 2.0;
        this.sideB = 2.0;
        this.sideC = 4.0;
        this.sideD = 4.0;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (sideA + sideC);
    }
}
