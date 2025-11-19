
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {
    public static void main(String[] args)
    {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before formatting "+myDateTime);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = myDateTime.format(myFormat);
        System.out.println("After formatting "+formattedDateTime);
    }
    }

