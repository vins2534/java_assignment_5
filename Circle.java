package assignment5;

public class Circle extends Shape {
    private double radius;
    
    // Setter method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter method to get the radius of the circle
    public double getRadius() {
        return radius;
    }
    
    // Method to calculate the area of the circle
    public double calculateArea() {
        // Area of circle = π * radius^2
        return Math.PI * Math.pow(radius, 2);
    }
    
    // Method to calculate the perimeter of the circle
    public double calculatePerimeter() {
        // Circumference of circle = 2 * π * radius
        return 2 * Math.PI * radius;
    }
}
