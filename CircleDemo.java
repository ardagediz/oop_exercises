import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        // Using the default constructor
        Circle defaultCircle = new Circle();
        System.out.println(defaultCircle); // Implicitly calls toString()

        // Create Circle with user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        try {
            Circle userCircle = new Circle(radius);
            System.out.println(userCircle); // Implicitly calls toString()

            // Compare circles
            if (defaultCircle.equals(userCircle)) {
                System.out.println("The circles are equal.");
            } else {
                System.out.println("The circles are not equal.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }

        // Attempt to create an invalid Circle object
        try {
            Circle invalidCircle = new Circle(-1);
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create a circle: " + e.getMessage());
        }
    }
}
