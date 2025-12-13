
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> idName = new TreeMap<Integer,String>();
        idName.put(16, "Anik");
        idName.put(17, "Mahan");
        idName.put(24, "Tamim");
        idName.put(26, "Mutahar");
        for(int i : idName.keySet()){
            System.out.println("id : "+i+" name : "+idName.get(i));
        }
        System.out.println("-------------------");
        for(String i : idName.values()) {
            System.out.println("value : "+i);
        }
    }
}
