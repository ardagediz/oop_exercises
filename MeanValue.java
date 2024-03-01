public class MeanValue {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.err.println("There are no arguments");
            System.exit(1);
        }

        double[] data = new double[args.length];

        for (int i = 0; args.length > i; i ++) {
            data[i] = Double.parseDouble(args[i]);
        }


        double mean = meanValue(data);
        System.out.printf("Mean: %.3f", mean);
    }

    public static double meanValue(double[] data) {

        double sum = 0;

        for (int i = 0; data.length >i; i++) {
            sum += data[i];
        }

        return sum / data.length;
    
    }

}