package Lesson16_present;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("1 key", 1);
        map.put("2 key", 2);
        map.put("3 key", 3);
        map.put("4 key", 4);

        for (Map.Entry<String, Integer> r: map.entrySet()){
            System.out.println(r);
        }

    }

}
