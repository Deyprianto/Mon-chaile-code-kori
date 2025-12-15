import java.util.ArrayList;
import java.util.Iterator;

public class RemoveelementIterator {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(12);
        nums.add(31);
        nums.add(154);
        nums.add(2);
        Iterator<Integer> it  = nums.iterator();

        while(it.hasNext()) {
            Integer x = it.next();
            if(x <= 10){
                it.remove();
            }

        }
        System.out.println(nums);

    }
}
