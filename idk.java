public class idk {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("No args given");
            System.exit(1);
        } 

        String password = args[0];
    }

    public static boolean enoughCharacters() {
        return password.length() >= 12;
    }

    public static boolean hasDigits() {
        int digitCount = 0;

        for (int i = 0; password.length() > i; i++) {
            if (Character.hasDigit())
        }
    }
}