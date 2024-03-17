public class betterchecker {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("No args given");
            System.exit(1);
        }
        String password = args[0];

        if (longenough(password) && hasThreeDigits(password) && hasSpecialCharacter(password)) {
            System.out.println("The password is valid");
        }
        else {
            System.out.println("The password is invalid");
        }


    }

    public static boolean longenough(String password) {
        return password.length() >= 12;
    }

    public static boolean hasThreeDigits(String password) {
        int digitCount = 0;

        for (int i = 0;password.length() > i; i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
            if (digitCount >= 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialCharacter(String password) {
        int specialCount = 0;

        for (int j= 0; password.length() > j; j++) {
            if (!Character.isDigit(password.charAt(j)) && !Character.isLetter(password.charAt(j))) {
                specialCount++;
            }
            if (specialCount >= 1) {
                return true;
            }
        }
        return false;
    }
}
