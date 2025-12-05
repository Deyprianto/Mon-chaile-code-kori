import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n=1;
        while(n != 11) {
            numbers.add(n);
            n++;
        } 
        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()){
            System.out.println(it.next());     
        }
    }
}
