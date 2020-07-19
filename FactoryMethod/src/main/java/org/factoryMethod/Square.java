package org.factoryMethod;

public class Square implements IShape {

    private Double sideA;
    private Double sideB;
    private Double sideC;
    private Double sideD;

    public Square() {
        this.sideA = 2.0;
        this.sideB = 2.0;
        this.sideC = 2.0;
        this.sideD = 2.0;
    }

    @Override
    public Double getPerimeter() {
        return sideA + sideB + sideC +sideD;
    }
}
