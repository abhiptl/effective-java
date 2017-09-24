package com.abhishek.item20;

/**
 * Created by AbhishekPatel on 9/22/2017.
 */
public abstract class  CorrectFigure {
    abstract double area();
}

class CircleFigure extends CorrectFigure {
    double radius;

    CircleFigure(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
