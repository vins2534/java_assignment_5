package assignment5;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    // Getter method to get the length of the rectangle
    public double getLength() {
        return length;
    }

    // Setter method to set the length of the rectangle
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method to get the breadth of the rectangle
    public double getBreadth() {
        return breadth;
    }

    // Setter method to set the breadth of the rectangle
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
