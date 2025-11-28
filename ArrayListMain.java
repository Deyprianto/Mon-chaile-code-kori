import java.util.ArrayList;

public class ArrayListMain{
    public static void main(String[] args) {
        ArrayList<String> cars  = new ArrayList<>();
        cars.add("walton");
        cars.add("noah");
        cars.add("cng");
        cars.add("rickshaw");
        cars.add("rickshaw");//duplicate values alllowed
        System.out.println(cars);

    }
}