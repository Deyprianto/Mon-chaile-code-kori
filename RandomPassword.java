import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
         String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
             + "abcdefghijklmnopqrstuvwxyz"
             + "0123456789" + "@#$%^&*!?";
             int size = 8;
             String pass ="";
             Random random = new Random();
             for(int i=1;i<=size;i++){
                int index = random.nextInt(all.length());
                pass += all.charAt(index);
             }
             System.out.print("your password is : "+pass);
    }
}
