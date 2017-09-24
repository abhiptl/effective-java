package com.abhishek.item20;

/**
 * Created by AbhishekPatel on 9/22/2017.
 *
 * Item20: Prefer class hierarchies to tagged classes
 */
public class App20 {
    public static void main(String[] args) {
        FigureTaggedClass figureTaggedClass = new FigureTaggedClass(5.0);
        System.out.println("Tagged Figure Area :" +figureTaggedClass.area());

        CorrectFigure correctFigure = new CircleFigure(5.0);
        System.out.println("Correct Figure Area :" +correctFigure.area());
    }
}
