
import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String,String> countryCity = new HashMap<String,String>();
        countryCity.put("England","London");
        countryCity.put("India","Delhi");
        countryCity.put("Bangladesh","Dhaka");
        countryCity.put("USA","california");
        countryCity.put("China","beijing");
        countryCity.put("Australia","brisbane");

        System.out.println(countryCity);
        countryCity.remove("Australia");
        System.out.println(countryCity);

        System.out.println(countryCity.size());

    }
}
