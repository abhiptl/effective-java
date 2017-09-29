package com.abhishek._03_classes_interfaces.item20;

/**
 * Created by AbhishekPatel on 9/22/2017.
 */
public class FigureTaggedClass {
    enum Shape {
        RECTANGLE, CIRCLE;
    }

    private Shape shape;
    private double width;
    private double height;

    private double radius;

    public FigureTaggedClass(double width, double height) {
        this.shape = Shape.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    public FigureTaggedClass(double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return width * height;
            case CIRCLE:
                return Math.PI * radius * radius;
            default:
                throw new AssertionError("Shape not supported yet");
        }
    }
}
