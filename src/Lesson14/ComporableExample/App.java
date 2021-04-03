package Lesson14.ComporableExample;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        User user = new User("Ivan", "New", "example@eamil.com", 20, 234567);
        User user1 = new User("Ivan", "New1", "example@eamil.com1", 20, 234567346);
        User user2 = new User("Vasyl", "LastN", "example@eamil.com1", 27, 234567346);

        System.out.println(user.compareTo(user1));
        System.out.println(user.compareTo(user2));

        List<User> list= new ArrayList<>();
        list.add(user1);
        list.add(user);
        list.add(user2);

        Collections.sort(list);
        System.out.println(list);

    }
}
