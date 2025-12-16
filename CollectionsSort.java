
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(3);

        Collections.sort(nums); //collections framework er sort method diye direct sort hoye gase 

        System.out.println(nums); 
    }
}
