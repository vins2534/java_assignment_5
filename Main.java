package assignment5;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Select the shape: ");
        System.out.println("1. Circle ");
        System.out.println("2. Rectangle ");
        System.out.println("3. Square ");
        System.out.println("4. Sphere ");
        System.out.println("5. Cylinder ");
        System.out.println("6. Pyramid ");

        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
            	System.out.println("Enter the radius: ");
                double radius = scanner.nextInt();
                Circle circle = new Circle();
                circle.setRadius(radius);
                System.out.println("Perimeter: " + circle.calculatePerimeter()); 
	            System.out.println("Area: " + circle.calculateArea());
                break;
                
            case 2:
            	 System.out.println("Enter the length:");
                 double length = scanner.nextDouble();
                 System.out.println("Enter the breadth:");
                 double breadth = scanner.nextDouble();
                 Rectangle rectangle = new Rectangle();
                 rectangle.setLength(length);
                 rectangle.setBreadth(breadth);
                 System.out.println("Perimeter: " + rectangle.calculatePerimeter()); 
	            System.out.println("Area: " + rectangle.calculateArea());
                 break;
                 
            case 3:
            	System.out.println("Enter the side:");
                double side = scanner.nextDouble();
                Square square = new Square();
                square.setSide(side);
                System.out.println("Perimeter: " + square.calculatePerimeter()); 
	            System.out.println("Area: " + square.calculateArea());
                break;
                
            case 4:
                System.out.println("Enter the radius:");
                radius = scanner.nextDouble();
                Sphere sphere = new Sphere();
                sphere.setRadius(radius);
	            System.out.println("Area: " + sphere.calculateArea());
                System.out.println("Volumne: "+ sphere.calculateVolume());
                break;

            case 5:
                System.out.println("Enter the radius:");
                radius = scanner.nextDouble();
                System.out.println("Enter the height:");
                double height = scanner.nextDouble();
                Cylinder cylinder = new Cylinder();
                cylinder.setRadius(radius);
                cylinder.setHeight(height);
	            System.out.println("Area: " + cylinder.calculateArea());
                System.out.println("Volume: "+ cylinder.calculateVolume());
                break;


            case 6:
                System.out.println("Enter the length of the edge of base:");
                double baseEdgeLength = scanner.nextDouble();
                System.out.println("Enter the slant height:");
                double slantHeight = scanner.nextDouble();
                Pyramid pyramid = new Pyramid();
                pyramid.setBaseEdgeLength(baseEdgeLength);
                pyramid.setSlantHeight(slantHeight);
	            System.out.println("Area: " + pyramid.calculateArea());
                System.out.println("Volume: "+ pyramid.calculateVolume());
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");        

        scanner.close();
    }

	}
}