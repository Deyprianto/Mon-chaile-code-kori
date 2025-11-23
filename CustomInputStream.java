
import java.io.FileInputStream;
import java.io.IOException;




public class CustomInputStream {
    public static void main(String[] args) throws IOException {
        try (FileInputStream input = new FileInputStream("legemds-squad.txt")) {
            int i;
          while((i = input.read())!= -1) {
            System.out.println((char) i);
          }
        
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
