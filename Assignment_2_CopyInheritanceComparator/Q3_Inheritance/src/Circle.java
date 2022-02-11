public class Circle extends Shape{
    double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void computePerimeter() {
        System.out.println("Perimeter: " + getPerimeter());
    }

    public void computeArea() {
        System.out.println("Area: " + getArea());
    }
}
