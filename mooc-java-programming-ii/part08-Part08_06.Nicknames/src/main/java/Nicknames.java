
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        Map<String, String> map = new HashMap<String, String>();
        map.put("matthew", "matt");
        map.put("michael", "mix");
        map.put("arthur", "artie");

        System.out.println(map.get("matthew"));
    }

}
