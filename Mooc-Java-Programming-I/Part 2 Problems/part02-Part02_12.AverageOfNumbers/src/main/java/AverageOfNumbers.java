
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if(input != 0){
                counter += 1;
                sum += input;
            }            
            if(input == 0){
                double avg = (double) sum / counter;
                System.out.println("Average of the numbers: " + avg);
                break;
            }
        }
    }
}
