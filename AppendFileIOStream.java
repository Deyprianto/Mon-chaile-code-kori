
import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFileIOStream {
    public static void main(String[] args) {
        String txt = "oky ,good night";

        try(FileOutputStream output = new FileOutputStream("append.txt",true )) {
            output.write(txt.getBytes());
            System.out.println("successfully append");
        } catch(IOException e) {
            System.out.println("Error handling file");
            e.getStackTrace();
        }
    }
}
