/**************************************************************************
 * Class: Triangle: Inherits Shape
 * Fields: base, height
 * Constructors:
 * triangle(side) → If single side is given then all sides to same value.
 * Override the getArea() and getPerimeter() getter methods of Shape in
 * triangle and Parallelogram to give desired output.
 **************************************************************************/
public class Triangle extends Shape{

    double base;
    double height;

    public Triangle(double side) {
        super();
        this.base = side;
        this.height = side * Math.sqrt(3) / 2;
    }

    public Triangle(String name, String color, double side) {
        super(name, color);
        this.base = side;
        this.height = side * Math.sqrt(3) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return base * 3;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
