
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Where to?");
        int tonum = scanner.nextInt();
        System.out.print("Where from?");
        int fromnum = scanner.nextInt();
        
        for(int i = fromnum ; i <= tonum ; i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
