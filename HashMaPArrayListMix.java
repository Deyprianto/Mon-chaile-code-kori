package ami_java_code;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapArrayListMix {
    static void main() {
        ArrayList<HashMap<String,String>> hotelList = new ArrayList<>();

        HashMap<String,String> hotel1 = new HashMap<>();
        hotel1.put("Name","Rojoni gandha");
        hotel1.put("Location","Dhaka");
        hotel1.put("Price","2000");

        HashMap<String,String> hotel2 = new HashMap<>();
        hotel2.put("Name","Bilash");
        hotel2.put("Location","Sylhet");
        hotel2.put("Price","1500");

        HashMap<String,String> hotel3 = new HashMap<>();
        hotel3.put("Name","Guljar");
        hotel3.put("Location","Dhaka");
        hotel3.put("Price","1200");

        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);

        System.out.println(hotelList);

       int total_price  = 0;

       for(int i=0;i< hotelList.size();i++) {
           HashMap<String,String> hotel = hotelList.get(i);
           String name = hotel.get("Name");
           String location = hotel.get("Location");
           String  price  = hotel.get("Price");

           System.out.println("Name : "+name+"\nlocation : "+location+"\nprice : "+price);
           System.out.println("----------------------------------------");

           total_price += Integer.parseInt(price);

       }
       for(HashMap<String,String> hotel : hotelList) {
           if(hotel.get("Location").equals("Dhaka")) {
               System.out.println("Name : "+hotel.get("Name")+"/ price : "+hotel.get("Price"));
           }
       }
       double average = (double) total_price/hotelList.size();

        System.out.printf("Average price is : %.2f%n",average);

    }
}
