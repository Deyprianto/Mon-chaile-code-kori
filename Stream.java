
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("img.png");
    FileOutputStream output = new FileOutputStream("new_img.png"))
{
     int i;
     while((i = input.read()) != -1) {
        output.write(i); //shera jinish pura pic copy hoye jay 
     }
}
catch(IOException e) {
    System.out.println("Error occurs");
}
    }
}
