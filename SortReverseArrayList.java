
import java.util.ArrayList;
import java.util.Collections;

public class SortReverseArrayList {
    //sort by number
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(8);
        nums.add(0);
        Collections.sort(nums,Collections.reverseOrder());

        for(Integer i:nums){
            System.out.println(i);
        }
    }
}
 
