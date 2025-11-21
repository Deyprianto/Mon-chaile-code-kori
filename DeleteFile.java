import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("data.txt");
        if(myObj.delete()) {
            System.out.println("File deleted successfully" +myObj.getName());
        }
        else {
            System.out.println("Not deleted");
        }
    }
}