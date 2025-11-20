
import java.io.File;

public class FileInfoRead {
    public static void main(String[] args) {
        File myFile = new File("legends-squad.txt");
       
            if(myFile.exists()) {
                System.out.println("File name "+myFile.getName());
                System.out.println("File path "+myFile.getPath());
                System.out.println("File writable "+myFile.canWrite());
                System.out.println("File redable "+myFile.canRead());
                System.out.println("File length "+myFile.length());
                System.out.println("File length "+myFile.getAbsolutePath());
            }
           
        }
    }
