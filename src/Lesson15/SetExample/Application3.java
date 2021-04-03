package Lesson15.SetExample;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Name");
        set.add("Lastname");
        set.add("Password");
        set.add("Password");
        set.add("a");
        set.add("ccc");
        set.add("bb");

        System.out.println(set);

        // System.out.println(set.add("some string"));
        // System.out.println(set.add("Lastname"));

    }

}
