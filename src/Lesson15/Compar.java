package Lesson15;



import java.util.Comparator;

public class Compar implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int result = Integer.compare(o1.getEmailAddress().length(), o2.getEmailAddress().length());
        return result;
    }
}
