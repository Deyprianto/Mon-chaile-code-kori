
import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("ovi");
        names.add("durjoy");
        names.add("siyam");
       // names.add("siyam");   hashset like a array list without duplicate values
        System.out.println(names);
    }
}
