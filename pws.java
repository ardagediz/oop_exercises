public class pws {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("No args given");
            System.exit(1);
        }

        String password = args[0];

        if (dg(password) && digit(password)) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }
    }

    public static boolean dg(String password) {
        return password.length() >= 12;
    }

    public static boolean digit(String password) {
        int digitc = 0;

        for (int i = 0; password.length() > i; i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitc++;
            }
            if (digitc >= 2) {
                return true;
            }
        }
        return false;
    }
}