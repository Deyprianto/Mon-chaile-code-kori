
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        for(int x : nums){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(nums.contains(9));
       // nums.clear();
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}
