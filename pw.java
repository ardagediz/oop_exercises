public class pw {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("No args given");
            System.exit(1);
        }

        String password = args[0];

        if (lengthChecker(password) && twoDigitChecker(password)) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }
    }

    public static boolean twoDigitChecker(String password) {
        int digitCount = 0;

        for (int i = 0; password.length() > i; i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
            if (digitCount >= 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean lengthChecker(String password) {
        return password.length() >= 12;
    }
}