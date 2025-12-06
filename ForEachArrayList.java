import java.util.ArrayList;

public class ForEachArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("rahim");
        names.add("karim");
        names.add("zabbar");
        names.add("shakil");

        for(String i:names) {
            System.out.println(i);
        }
        
    }
}
