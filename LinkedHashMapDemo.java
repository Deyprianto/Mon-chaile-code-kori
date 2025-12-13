
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> nameId = new LinkedHashMap<String,Integer>();
        nameId.put("anik",17);
        nameId.put("mahan",18);
        nameId.put("dhiraj",19);
        nameId.put("prianto",37);
        nameId.put("shereyar",38);

        System.out.println(nameId);

        for(String i:nameId.keySet()) {
            System.out.println("name : "+i+" id : "+nameId.get(i));
        }
        System.out.println(nameId.size());
        nameId.remove("dhiraj");
        System.out.println(nameId.size());
    }
}
