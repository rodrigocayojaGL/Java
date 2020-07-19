package org.factoryMethod;

public class Rhombus implements IShape {

    private Double sideA;
    private Double sideB;
    private Double sideC;
    private Double sideD;

    public Rhombus() {
        this.sideA = 13.0;
        this.sideB = 13.0;
        this.sideC = 13.0;
        this.sideD = 13.0;
    }
    @Override
    public Double getPerimeter() {
        return sideA + sideB + sideC +sideD;
    }
}
