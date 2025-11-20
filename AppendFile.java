
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("legends-squad.txt",true);
            myFile.write("\n legends squad is not only a friends group ,but also an emotion for dhiraj");
            myFile.close();
            System.out.println("Append to file successfully");
        } catch (IOException e) {
            System.out.println("Exceptions occurs");
            e.printStackTrace();
        }
    }
}
