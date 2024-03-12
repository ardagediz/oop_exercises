import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        System.out.println("This is a rectangle program");
        System.out.println("Enter your width here: ");
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        System.out.println("Enter your height here: ");
        double height = scanner.nextDouble();

        double area = height * width;

        System.out.printf("The area is %.2f%n", area);
        
    }
}