
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterate {
    public static void main(String[] args) {
        ArrayList<String> degree = new ArrayList<>();

        degree.add("CSE");
        degree.add("SWE");
        degree.add("ECO");
        degree.add("BBA");
        degree.add("EEE");
        System.out.println(degree);

        Iterator<String> it = degree.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());  //iterator use kora shoklam vai
        }
     }
}
