import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Dataset {
    private ArrayList<Double> data;

    public Dataset(String filename) throws IOException {
        data = new ArrayList<>();
        Scanner scanner = new Scanner(Path.of(filename));
        while (scanner.hasNextDouble()) {
            data.add(scanner.nextDouble());
        }
        scanner.close();

    }

    public int size() {
        return data.size();
    }

    public double meanValue() {
        double sum = 0;


        /* This line is like in pythons for each line. e.g for each char in list. */
        for (double value : data) {
            sum += value;
        }
        return sum / data.size();
    }
}
