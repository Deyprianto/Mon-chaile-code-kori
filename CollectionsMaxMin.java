
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        System.out.println("Maximum value is "+Collections.max(nums));
        System.out.println("Minimun valus is "+Collections.min(nums));

        Collections.shuffle(nums);
        System.out.println(nums);

        System.out.println("Frequency of 1 is "+Collections.frequency(nums,1));

    }
}