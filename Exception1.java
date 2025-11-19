public class Exception1 {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        try{
            System.out.println(arr[3]);
        } catch(Exception e) {
            System.out.println("Not present in array");
        } 
        finally{
            System.out.println("try-catch block finished");
        }
    }
}
