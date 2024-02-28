import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        System.out.println("This is a kilo to Imperial Units conversion program");
        System.out.println("Enter your kilo amount here:");
        Scanner scanner = new Scanner(System.in);
        double input_kilo = scanner.nextDouble();

        double ounces = input_kilo * 35.274;
        int pounds = (int) (ounces/16);
        double remaining_ounes = ounces % 16;

        System.out.printf("Your kilos in pounds/ounces is %d pounds and %.1f ounces", pounds, remaining_ounes);
    }
}