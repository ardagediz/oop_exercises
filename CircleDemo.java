import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {

        System.out.println("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("Radius: %.3f%n", circle.getRadius());
        System.out.printf("Perimeter: %.3f%n", circle.perimeter());
        System.out.printf("Area: %.3f%n", circle.area());

        scanner.close();
    }
}