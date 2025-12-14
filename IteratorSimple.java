import java.util.*;

public class IteratorSimple {
    public static void main(String[] args) {
        ArrayList<String> sobji = new ArrayList<String>();
        sobji.add("alu");
        sobji.add("kumra");
        sobji.add("mula");
        sobji.add("sim");
        sobji.add("lau");

        Iterator<String> it = sobji.iterator();
     //   System.out.println(it.next());

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
