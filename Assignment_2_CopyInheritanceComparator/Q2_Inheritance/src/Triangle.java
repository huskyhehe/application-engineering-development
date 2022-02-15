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

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double side) {
        this.base = side;
        this.height = side * Math.sqrt(3) / 2;
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
