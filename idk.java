public class idk {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("No args given");
            System.exit(1);
        } 

        String password = args[0];

        if (enoughCharacters(password) && hasSpecialChar(password) && hasDigits(password)) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }
    }

    public static boolean enoughCharacters() {
        return password.length() >= 12;
    }

    public static boolean hasDigits() {
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
    
    public static boolean hasSpecialChar() {
        int specialCharCount = 0;

        for (int j = 0; password.length() > j; j++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
                specialCharCount++;
            }
            if (specialCharCount >= 2) {
                return true;
            }
        }
        return false;
    }
}