import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<String> names  = new HashSet<String>();

        names.add("dhiraj");
        names.add("tamim");
        names.add("mutahar");
        names.add("lonely");
        names.add("lonely");
        //names.add("anik");
        names.add("anik");
        for(String i:names) {
            System.out.println(i);
        }

        System.out.println("---------------");

        boolean x = names.contains("anik");
        System.out.println(x);
        System.out.println("---------------");
        names.remove("dhiraj");

        System.out.println(names);

      //  names.clear();
       // System.out.println(names);


        
    }
}
