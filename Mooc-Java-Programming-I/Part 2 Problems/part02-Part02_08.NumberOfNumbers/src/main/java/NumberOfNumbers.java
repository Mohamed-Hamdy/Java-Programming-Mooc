
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if(input != 0){
                counter += 1;
            }            
            if(input == 0){
                System.out.println("Number of numbers: " + counter);
                break;
            }
        }
    }
}
