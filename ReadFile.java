
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("legends-squad.txt");
        try (Scanner myRead =new Scanner(myFile)) {
            while(myRead.hasNextLine()) {
                String data = myRead.nextLine();
                System.out.println(data);
            }

        } catch(IOException e) {
            System.out.println("Exception occours");
            e.printStackTrace();
        }
    }
} 
//easy ase but aktu tricky o ase ..pera nai dekha jak
