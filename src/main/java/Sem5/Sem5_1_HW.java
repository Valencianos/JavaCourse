package Sem5;

import java.util.*;

public class Sem5_1_HW {
    public static void main(String[] args) {

        HashMap<String, String> pb = new HashMap<>();
        addData(pb,"Olesya", "9102548124");
        addData(pb,"Eugene", "9167112584");
        addData(pb,"Oleg", "9185632154");
        addData(pb,"Stan", "9213256591");
        addData(pb,"Stan", "9032145487");
        addData(pb,"Stefania", "9135412894");
        addData(pb,"Oleg", "9031286985");
        addData(pb,"Oleg", "9012548741");

        pb.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
    public static void addData(HashMap<String,String> map, String key, String value) {
        if (map.containsKey(key)){
            map.put(key, value +"; "+ map.get(key));
        }else{
            map.put(key,value);
        }
    }
}
