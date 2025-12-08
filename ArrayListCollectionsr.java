
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionsr {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("alu");
        names.add("potol");
        names.add("begun");
        names.add("lau");
        Collections.sort(names);

        for(String i:names){
            System.out.println(i);
        }
    }
}
