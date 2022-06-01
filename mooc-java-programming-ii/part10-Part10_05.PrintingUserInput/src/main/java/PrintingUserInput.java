
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String x = scanner.nextLine();
            if (!x.isEmpty()) {
                list.add(x);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                break;
            }
        }

    }
}
