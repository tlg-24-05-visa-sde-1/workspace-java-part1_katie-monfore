package edu.geometry;

import java.awt.*;

public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double angleBetween;

    public Triangle(double sideA, double sideB, double angleBetween) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleBetween = angleBetween;



    }

    @Override
    public double getArea() {
        return .5*sideA*sideB * Math.sin(Math.toRadians(angleBetween));
    }
}

