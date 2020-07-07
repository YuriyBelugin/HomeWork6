package com.company;

import java.util.Objects;

public class Square extends Figure {
    private int a1;

    public Square(int a1) {
        this.a1 = a1;
    }

    @Override
    public double area() {
        return a1 * a1;
    }

    @Override
    public double perimeter() {
        return a1 * 4;
    }

    @Override
    public String getType() {
        return "Квадрат ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return a1 == square.a1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a1);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a1=" + a1 +
                '}';
    }
}
