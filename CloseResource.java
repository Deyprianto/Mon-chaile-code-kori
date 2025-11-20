
import java.io.FileOutputStream;
import java.io.IOException;

public class CloseResource {
    public static void main(String[] args) {
        try {
            FileOutputStream object = new FileOutputStream("data.txt");
            object.write("hello".getBytes());
            object.close(); //a resource must be closed after use
            System.out.println("Successfully wrote into the file");
        } catch (IOException e) {
            System.out.println("Error writing in file");
        }
    }
}
