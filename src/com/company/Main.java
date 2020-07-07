package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 8);
        Square square = new Square(8);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(10, 10);
        Ellipse ellipse = new Ellipse(7, 3);

        System.out.println(rectangle.NAME + " площадь " + rectangle.area() + ", периметр  " + rectangle.perimeter());
        System.out.println(square.NAME + " площадь " + square.area() + ", периметр  " + square.perimeter());
        System.out.println(circle.NAME + " площадь " + circle.area() + ", периметр  " + circle.perimeter());
        System.out.println(triangle.NAME + " площадь " + triangle.area() + ", периметр  " + triangle.perimeter());
        System.out.println(ellipse.NAME + " площадь " + ellipse.area() + ", периметр  " + ellipse.perimeter());

        System.out.println();

        System.out.println(rectangle.equals(rectangle));
        System.out.println(square.equals(triangle));
        System.out.println(circle.equals(ellipse));
        System.out.println(triangle.equals(triangle));
        System.out.println(ellipse.equals(rectangle));

        System.out.println();

        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(4, 8);
        figures[1] = new Square(8);
        figures[2] = new Circle(7);
        figures[3] = new Triangle(10, 10);
        figures[4] = new Ellipse(7, 3);

        for (int i=0; i<figures.length; i++){
            System.out.println(figures[i].toString() + " " + figures[i].area() + " " + figures[i].perimeter());

        }

    }
}
