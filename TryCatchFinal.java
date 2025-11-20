public class TryCatchFinal {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch(Exception e){
            System.out.println("You have error in your code");
        } 
        finally{
            System.out.println("Program finish");
        }
    }
}
