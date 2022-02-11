public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {
        super();
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }


    public void computePerimeter() {
        System.out.println("Perimeter: " + getPerimeter());
    }

    public void computeArea() {
        System.out.println("Area: " + getArea());
    }
}
