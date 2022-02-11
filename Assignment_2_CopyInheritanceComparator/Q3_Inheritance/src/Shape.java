public class Shape {
    private String name;
    private double perimeter;
    private double area;

    public Shape() {
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void display() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        if (name == null)
            System.out.println("This shape doesn't have a name.");
        if (name != null)
        System.out.println("This shape's name is " + getName());
        System.out.println("Perimeter: " + getPerimeter() + " | Area: " + getArea());
    }
}
