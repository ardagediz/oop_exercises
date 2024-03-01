public class MeanValue {
  public static double meanValue(double[] data) {
    /* use sum and a loop to calc the mean and return it to the main */

    double sum = 0;

    for (int i = 0; data.length > i; i++) {
        sum += data[i];
    }

    return sum / data.length

  }

  public static void main(String[] args) {
    if (args.length <= 0) {
        System.err.println("There are no args");
    }

    double[] data = new double[args.length];

    for (int i = 0; data.length(); i++) {
        try{
            data[i] = Double.parseDouble(args[i]);
        } catch (NumberFormatException e) {
            System.err.println("All arguments must be numbers.");
            System.exit(1);
        }
        
    }

    double mean = meanValue(data);

    System.out.printf("Mean: %.3f", mean);
  }

}