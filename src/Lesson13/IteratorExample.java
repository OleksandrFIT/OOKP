package Lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");

        /*
        for(String s :stringList){
            stringList.remove(s);
        }
        */


        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(stringList);

    }
}
