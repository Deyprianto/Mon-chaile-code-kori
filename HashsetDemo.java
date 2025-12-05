
import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("alu");
        names.add("kodu");
        names.add("mula");
        names.add("mula");
        //no duplicates value allowed
        System.out.println(names);
    }
}
