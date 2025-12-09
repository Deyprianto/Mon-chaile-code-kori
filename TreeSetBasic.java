
import java.util.TreeSet;

public class TreeSetBasic {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<Integer>();
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(4);

        for(Integer i:nums) {
            System.out.println(i);
        }
       if(nums.contains(2) ) {
        System.out.println("contains");
       } else {
        System.out.println("Not contains");
       }
       System.out.println(nums.size());
    }
}
