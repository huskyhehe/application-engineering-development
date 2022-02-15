public class Rhombus extends Shape {
    double diagonal1;
    double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(double diagonal) {
        this.diagonal1 = diagonal;
        this.diagonal2 = diagonal;
    }

    @Override
    public double getPerimeter() {
        return (diagonal1 + diagonal2) * 2;
    }

    @Override
    public double getArea() {
        return diagonal1 * diagonal2 / 2;
    }
}
