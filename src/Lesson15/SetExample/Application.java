package Lesson15.SetExample;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Name");
        set.add("Lastname");
        set.add("Password");
        set.add("Password");

        for (String s : set){
            System.out.println(s + " hashCode " + s.hashCode());
        }

       // System.out.println(set.add("some string"));
       // System.out.println(set.add("Lastname"));

    }

}
