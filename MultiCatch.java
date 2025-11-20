public class MultiCatch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try{
               // System.out.println(arr[10]);
               // System.out.println(10/0);
        }
        catch(ArrayIndexOutOfBoundsException e) {
             System.out.println("Array out of bound exception");
        } 
        catch(ArithmeticException e) {
            System.out.println("Cannot devide by zero");
        }
        catch(Exception e) {
            System.out.println("Something else");
        }

    }
}
