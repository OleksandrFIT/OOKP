package Lesson14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            int i = listIterator.nextIndex();
            list.set(i, list.get(i) * 5);
            listIterator.next();
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }



    }
}
