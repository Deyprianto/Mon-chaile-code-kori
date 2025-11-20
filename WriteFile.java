import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
           FileWriter myObj = new FileWriter("legends-squad.txt");

            myObj.write("There are many frind group can be made ,but our one is special beacouse we all are legends here...!");
            myObj.close();
            System.out.println("Writing is successful");
        }catch(IOException e) {
            System.out.println("Exceptions occurs");
            e.printStackTrace();
        }
    }
}
