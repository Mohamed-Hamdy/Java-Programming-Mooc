
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers) {
//        List<Integer> p_numbers = null;
//        for(int i = 0; i<numbers.size(); i++){
//            if(numbers.get(i) > 0){
//                p_numbers.add(numbers.get(i));
//            }
//        }
//        return p_numbers;

        ArrayList<Integer> getPosNumbers = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return getPosNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
}
