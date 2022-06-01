
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int First = 0;
        int Second = 0;
        int max = 100;
        System.out.println("First:" + First + "/" + max);
        System.out.println("Second:" + Second + "/" + max);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if ("add".equals(command) && amount >= 0) {
                    if (amount >= 100) {
                        First = 100;
                    } else {
                        First += amount;
                        if(First > 100){
                            First = 100;
                        }
                    }

                } else if (command.equals("move") && amount >= 0) {
				if ((First - amount) >= 0) {
					Second += amount;
					First -= amount;
					if (Second >= max) {
						Second = max;
					}
				} else if ((First - amount) < 0) {
					Second += First;
					First = 0;
					if (Second >= max) {
						Second = max;
					}
				}
			}else if (command.equals("remove") && amount >= 0) {
				if ((Second - amount) >= 0) {
					Second -= amount;
				} else if ((Second - amount) < 0){
					Second = 0;
				}
			}

                
                System.out.println("First:" + First + "/" + max);
                System.out.println("Second:" + Second + "/" + max);
            }
        }
    }

}
