package assignment5;

public class Sphere extends Shape implements Volume {
    private double radius;
    
    // Setter method to set the radius of the sphere
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter method to get the radius of the sphere
    public double getRadius() {
        return radius;
    }
    
    // Method to calculate the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate the surface area of the sphere
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // As sphere does not have a perimeter, this method returns 0
    public double calculatePerimeter() {
        return 0.0;
    }
}