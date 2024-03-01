public class CheckPassword {

  public static void main(String[] args) {
    /* Give a success/valid or invalid noti*/

    if (args.length <= 0) {
      System.err.println("There are no arguments");
      System.exit(1);
    }

    String password = args[0];


    if (longEnough(password) && atLeastTwoDigits(password)) {
      System.out.println("The password is valid");
    }
    else {
      System.out.println("The password is invalid");
    }



  }

  public static boolean longEnough(String password) {
    return password.length() >= 12;

  }

  public static boolean atLeastTwoDigits(String password) {
    /* Contain atleast two digits, will need loop for this also, isDigit() and charAt() */

    int digitCounter = 0;

    for (int i = 0; password.length() > i; i++) {
      if (Character.isDigit(password.charAt(i))) {
        digitCounter ++;
        if (digitCounter >= 2) {
          return true;
        }
      }
    }
    return false;
  }
}

