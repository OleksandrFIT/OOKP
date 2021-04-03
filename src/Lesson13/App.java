package Lesson13;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        Collections.sort(stringList);
        System.out.println(stringList);
        int index = Collections.binarySearch(stringList,"ad");
        System.out.println(index);

        String [] arr= {"at","beew","cqwdfue","dyy"};
        Arrays.sort(arr);
        /*
        Arrays.sort(arr, Comparator.reverseOrder());
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        */

        int element = Arrays.binarySearch(arr, "at");
        System.out.println(element);

      //  for (String s : arr){
      //      System.out.println(s);
      //  }



        List<String> stringLinkedList= new LinkedList<>();
        add(stringLinkedList);
        stringLinkedList.add("a");
        stringLinkedList.add("b");
        stringLinkedList.add("c");
        stringLinkedList.add("d");
        stringLinkedList.add("e");
        stringLinkedList.add(3, "color");
        System.out.println(stringLinkedList);

    }

    public static void add(List<String> list){
        list.add("string a");
        System.out.println(list);
    }

}
