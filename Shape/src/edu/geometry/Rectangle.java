package edu.geometry;

public class Rectangle implements Shape {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}