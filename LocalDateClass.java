import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        System.out.println(myDate); 
        System.out.println(myTime);
    }
}
