/********************************************************************************
 * Class: Parallelogram: Inherits Shape
 * Fields: base, height, side
 * Constructor:
 * Parallelogram (base, height, side)
 * Parallelogram (side) → If single side is given then all sides to same value.
 *******************************************************************************/

public class Parallelogram extends Shape {
    double base;
    double height;
    double side;

    public Parallelogram(double base, double height, double side) {
        super();
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public Parallelogram(String name, String color, double base, double height, double side) {
        super(name, color);
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public Parallelogram(double side) {
        super();
        this.side = side;
        this.base = side;
    }


    public double getBase() {
        return base;
    }


    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getPerimeter() {
        return (base + side) * 2;
    }

    @Override
    public double getArea() {
        return base * height;
    }
}
