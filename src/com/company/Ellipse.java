package com.company;

import java.util.Objects;

public class Ellipse extends Figure {
    private int bigSemiaxis;
    private int smallSemiaxis;

    public Ellipse(int bigSemiaxis, int smallSemiaxis) {
        this.bigSemiaxis = bigSemiaxis;
        this.smallSemiaxis = smallSemiaxis;
    }

    @Override
    public double area() {
        return Math.PI * bigSemiaxis * smallSemiaxis;
    }

    @Override
    public double perimeter() {
        return (Math.PI * smallSemiaxis * bigSemiaxis + (smallSemiaxis - bigSemiaxis)) / (smallSemiaxis + bigSemiaxis) * 4;
    }

    @Override
    public String getType() {
        return "Овал = ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ellipse)) return false;
        Ellipse ellipse = (Ellipse) o;
        return bigSemiaxis == ellipse.bigSemiaxis &&
                smallSemiaxis == ellipse.smallSemiaxis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bigSemiaxis, smallSemiaxis);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "bigSemiaxis=" + bigSemiaxis +
                ", smallSemiaxis=" + smallSemiaxis +
                '}';
    }
}
