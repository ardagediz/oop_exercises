/* The a is equitorial radius and c is polar radius   */

import java.util.Scanner;

public class spheroid {
    public static void main(String[] args) {
        System.out.println("This is a program to calculate the eccentricity and volume of a spheroid");

        System.out.println("Enter your equitorial radius here: ");
        Scanner scanner = new Scanner(System.in);
        double er = scanner.nextDouble();
        if (er <= 0 ) {
            System.out.println("Error: equatorial radius must be larger than 0");
            System.exit(1);
        }

        System.out.println("Enter your polar radius here: ");
        double pr = scanner.nextDouble();

        if (pr <= 0 ) {
            System.out.println("Error: polar radius must be larger than 0");
            System.exit(1);
        }

        if (er < pr) {
            System.out.println("Error: equatorial radius must be larger than polar radius");
            System.exit(1);
        }

        double eccentricity = Math.sqrt(1 - Math.pow(pr / er, 2));

        double volume = (4.0/3) * Math.PI * Math.pow(er, 2) * pr;

        System.out.printf("The eccentricity is %.3f%n", eccentricity);
        System.out.printf("The volume is %g cubic km%n", volume);

        scanner.close();

    }
}