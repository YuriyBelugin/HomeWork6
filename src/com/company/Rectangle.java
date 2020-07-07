package com.company;

import java.util.Objects;

public class Rectangle extends Figure {
    private int a1;
    private int a2;

    public Rectangle(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public double area() {
        return a1 * a2;
    }

    @Override
    public double perimeter() {
        return (a1 + a2) * 2;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    public final static String NAME = "Прямоугольник";


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return a1 == rectangle.a1 &&
                a2 == rectangle.a2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a1, a2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                '}';
    }
}
