
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n_AVG = 0;
        double n_sum = 0;
        int n_counter = 0;

        double p_AVG = 0;
        double p_sum = 0;
        int p_counter = 0;

        String n_Or_p = "";
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String x = scanner.nextLine();
            if ("end".equals(x)) {
                n_AVG = n_sum / n_counter;
                p_AVG = p_sum / p_counter;
                break;
            } else {
                if (Integer.parseInt(x) < 0) {
                    n_sum += Double.parseDouble(x);
                    n_counter++;
                } else {
                    p_sum += Double.parseDouble(x);
                    p_counter++;

                }
            }
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        n_Or_p = scanner.nextLine();
        if ("n".equals(n_Or_p)) {
            System.out.println("average of the negative numbers:" + n_AVG);
        } else {
            System.out.println("average of the positive numbers:" + p_AVG);
        }
    }
}
