
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        nums.addFirst(10);
        nums.addLast(20);
        System.out.println(nums);
        System.out.println(nums.getFirst());

    }
}
