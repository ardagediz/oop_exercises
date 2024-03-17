public class optimisedChecker {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("No args given");
            System.exit(1);

        }

        String password = args[0];

        if (passwordIsValid(password)) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }
    }

    public static boolean passwordIsValid(String password) {
        if (password.length() < 12) {
            return false;
        }

        int digitCount = 0;
        boolean hasSpecialCharacter = false;

        for (int i = 0; password.length() > i; i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch)) {
                hasSpecialCharacter = true;
            }
            
        }

        return digitCount >=2 && hasSpecialCharacter;
    }
}