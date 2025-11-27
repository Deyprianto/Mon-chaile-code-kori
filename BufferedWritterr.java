import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWritterr {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("append.txt",true))) {
            bw.newLine();
            bw.write("append to the text");
            System.out.println("Append successful");
        } catch(Exception e) {
            System.out.println("Exception occurs");
        }
    }
}
