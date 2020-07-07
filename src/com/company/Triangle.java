package com.company;

import java.util.Objects;

public class Triangle extends Figure {
    private int a;
    private int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private double c = Math.sqrt(a * a + b * b);

    @Override
    public double area() {
        return a * b / 2;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return NAME;
    }

    public final static String NAME = "Треугольник";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
