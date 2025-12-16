import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBinarySearch {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("korim");
        names.add("sadik");
        names.add("bokkor");
        names.add("tufayel");
        names.add("imteaj");

        Collections.sort(names);

        int index = Collections.binarySearch(names,"tufayel");
        
        if(index >= 0) {
           System.out.println("Found in index : "+index);
        } 
        else {
            System.out.println("Not found");
        }
        
    }
}
