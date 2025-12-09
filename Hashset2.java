
import java.util.HashSet;


public class Hashset2 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<Integer>();
        nums.add(2);
        nums.add(8);
        nums.add(5);
        nums.add(10);

        for(int i=1;i<=10;i++) {
            if(nums.contains(i)) {
                System.out.println(i+" found in set");
            } else {
                System.out.println(i+" not found in set");
            }
        }
        
    }
}
