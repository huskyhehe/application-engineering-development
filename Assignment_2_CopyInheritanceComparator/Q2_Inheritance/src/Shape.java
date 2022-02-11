/*************************************************************************
 * Class: Shape
 * Fields: name, color, area, perimeter
 * Constructors: Shape (name, color), Shape (name, color, perimeter, area)
 * Methods: printShape(), getArea(), getPerimeter()
 *************************************************************************/

public class Shape {
    String name;
    String color;
    double perimeter;
    double area;


    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double perimeter, double area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Shape() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void printShape() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        if (getName() != null && getColor() != null) {
            System.out.println("Name: " + getName() + " | Color: " + getColor());
        }else {
            System.out.println("This shape doesn't have a name and color");
        }
        System.out.println("Perimeter: " + getPerimeter() + " | Area: " + getArea());
    }
}
