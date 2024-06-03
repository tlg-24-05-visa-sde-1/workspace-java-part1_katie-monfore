package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

import java.util.ArrayList;
import java.util.Collection;

public class ShapeClient {

    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle circumference: " + circle.getCircumference());
        System.out.println();

        Rectangle rectangle = new Rectangle(1.0, 2.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println();

        Triangle triangle = new Triangle(2.0, 3.0, 30.0);
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println();

        Collection<Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        double totalArea = 0.0;
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Shape area: " + area);
            totalArea += area;  //totalArea = totalArea + area
        }
        System.out.println("total area: " + totalArea);

    }
}

