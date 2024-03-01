public class CheckPassword {

    public static boolean longEnough(String password) {
        return password.length() >= 12;
    }

    public static boolean atLeastTwoDigits(String password) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
                if (digitCount >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("The argument must have chars");
            System.exit(1);
        }

        String password = args[0];

        if (longEnough(password) && atLeastTwoDigits(password)) {
            System.out.println("The password is valid");
        } else {
            System.out.println("The password is invalid");
        }
    }
}
