
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        Collections.sort(nums,Collections.reverseOrder()); //reversely sorted

        System.out.println(nums);
    }
}
