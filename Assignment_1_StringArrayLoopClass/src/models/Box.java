/****************************************************
 * Question 10: Implement a class Box {
 *   double width;
 *   double height;
 *   double depth;
 * }
 * Initialize the value through constructor.
 * Write a function to calculate the box volume.
 ****************************************************/
package models;

public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double calculateVolume() {
        return width * height * depth;
    }
}
