
import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String,String> countrycity = new HashMap<>();
        countrycity.put("India","delhi");
        countrycity.put("Bangladesh","dhaka");
        countrycity.put("Singapur","vatican city");
        countrycity.put("Nepal","katmandu");
        countrycity.put("Germany","berlin");

        System.out.println(countrycity);  //key value pair 

    }
}
