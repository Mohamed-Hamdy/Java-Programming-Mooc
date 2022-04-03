
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int counter = 0;
        while (true) {
            
            int input = scanner.nextInt();
            if(input > 0){
                counter += 1;
                sum += input;
            }else if(input == 0 && counter== 0){
                System.out.println("Cannot calculate the average");
            }            
            if(input == 0){
                double avg = (double) sum / counter;
                System.out.println(avg);
                break;
            }
        }
    }
}
