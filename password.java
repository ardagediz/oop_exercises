public class password {

    public static boolean longEnough(String password) {
        return password.length() >= 12;

    }

    public static boolean atLeastTwoDigits(String password) {
        int digitcounter = 0;

        for (int i = 0; password.length() > i; i++) {
            if (Character.isDigit(password.charAt(i))){
                return true;
            }
            if (digitcounter >= 2) {
                digitcounter++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("No args given");
            System.exit(1);
        }

        String password = args[0];

        if (longEnough(password) && atLeastTwoDigits(password)) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }
        
    }
}
