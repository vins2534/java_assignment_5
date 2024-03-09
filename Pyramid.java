package assignment5;

public class Pyramid extends Shape implements Volume {
    private double baseEdgeLength;
    private double slantHeight;
    
    // Getter method to get the length of the base edge of the pyramid
    public double getBaseEdgeLength() {
        return baseEdgeLength;
    }
    
    // Setter method to set the length of the base edge of the pyramid
    public void setBaseEdgeLength(double baseEdgeLength) {
        this.baseEdgeLength = baseEdgeLength;
    }
    
    // Getter method to get the slant height of the pyramid
    public double getSlantHeight() {
        return slantHeight;
    }
    
    // Setter method to set the slant height of the pyramid
    public void setSlantHeight(double slantHeight) {
        this.slantHeight = slantHeight;
    }
    
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.pow(baseEdgeLength, 2) * slantHeight;
    }
    
    // Method to calculate the total surface area of the pyramid
    public double calculateArea() {
        return Math.pow(baseEdgeLength, 2) + 2 * baseEdgeLength * slantHeight;
    }
    
    // As pyramid does not have a perimeter, this method returns 0
    public double calculatePerimeter() {
        return 0.0;
    }
}
