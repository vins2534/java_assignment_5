package assignment5;

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;
    
    // Getter method to get the radius of the cylinder
    public double getRadius() {
        return radius;
    }
    
    // Setter method to set the radius of the cylinder
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter method to get the height of the cylinder
    public double getHeight() {
        return height;
    }
    
    // Setter method to set the height of the cylinder
    public void setHeight(double height) {
        this.height = height;
    }
    
    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate the total surface area of the cylinder
    public double calculateArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    // As cylinder does not have a perimeter, this method returns 0
    public double calculatePerimeter() {
        return 0.0;
    }
}
