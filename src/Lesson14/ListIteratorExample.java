package Lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
       // list.add("c");
       // list.add("d");

        ListIterator<String> iterator = list.listIterator();

        System.out.println("next");
     /*   while (iterator.hasNext()){
            System.out.print(iterator.nextIndex()+ " ");
            System.out.print(iterator.next() + " ");
        }*/


        /*while (iterator.hasNext()){
            iterator.next();
            System.out.print(iterator.nextIndex()+ " ");
        }*/


     /*
        System.out.println("\n"+ "previous");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previousIndex() + " ");
            System.out.print(iterator.previous() + " ");
        }
        */


     /*   while (iterator.hasPrevious()){
            System.out.print(iterator.previousIndex() + " ");
        }*/



        while (iterator.hasNext()){
            iterator.next();
            if (list.size() < 10){
                iterator.add("e");
            }
        }

        System.out.println(list);



    }
}
