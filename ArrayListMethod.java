
import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("pronoy");
        names.add("das");
        names.add("mohon");
        System.out.println(names.get(1));
        names.set(2,"brommochari");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        names.set(1,"demon");
        System.out.println(names);
        
    } 
}
