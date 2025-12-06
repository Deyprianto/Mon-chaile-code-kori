
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers  = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
