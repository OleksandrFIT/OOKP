package Lesson14.ComparableExample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Vasyl", 25, "vasyl20@gmail.com"));
        usersList.add(new User("Ivan", 32, "ivan20@gmail.com"));
        usersList.add(new User("Ivan", 23, "ivan20@gmail.com"));
        usersList.add(new User("Andriy", 25, "andriy20@gmail.com"));
        usersList.add(new User("Stepan", 20, "stepan20@gmail.com"));
       // Collections.sort(usersList);
        //System.out.println(usersList);


        UserComparator comparator = new UserComparator();
        Collections.sort(usersList, comparator);
        System.out.println(usersList);

    }

}
