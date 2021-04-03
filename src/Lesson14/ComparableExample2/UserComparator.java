package Lesson14.ComparableExample2;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int result = o1.getUserName().compareTo(o2.getUserName());
        if (result == 0){
            result = Integer.compare(o1.getAge(), o2.getAge());
        }
        if (result == 0){
            result = o1.getEmailAddress().compareTo(o2.getEmailAddress());
        }
        return result;
    }
}
