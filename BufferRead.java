
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new FileReader("janina.txt"))) {
            String line;
            while((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Exception occurs");
        }
    }
}
