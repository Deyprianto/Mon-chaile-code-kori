
import java.io.FileOutputStream;


public class FileOpStream {
    public static void main(String[] args) {
        String text = "i am a looser ,but do the last try";
        try(FileOutputStream output = new FileOutputStream("new_text.txt")) {
            output.write(text.getBytes());
        } catch(Exception e) {
            System.out.println("Error occurs");
            e.printStackTrace();
        }
    }
}
