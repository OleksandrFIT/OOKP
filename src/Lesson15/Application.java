package Lesson15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("userTes1@mail.com"));
        userList.add(new User("userTes12@mail.com"));
        userList.add(new User("userTes1234@mail.com"));
        userList.add(new User("userTes2@mail.com"));
        userList.add(new User("userTes1244@mail.com"));
        userList.add(new User("userTes12142352344@mail.com"));
        userList.add(new User("userTes128@mail.com"));
        userList.add(new User("userTes1242344@mail.com"));

        Compar compar = new Compar();
        Collections.sort(userList, compar);
        System.out.println(userList);

    }

}
