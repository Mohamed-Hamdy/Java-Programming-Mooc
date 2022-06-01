
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double AVG ;
        double sum = 0 ;
        int counter = 0;
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String x = scanner.nextLine();
            if("end".equals(x)){
                //System.out.println(sum +" "+ counter);
                
                AVG = sum / counter;
                System.out.println("average of the numbers:" + AVG);
                break;
            }else{
                sum += Double.parseDouble(x);
                counter++;
            }
            
        }
    }
}
