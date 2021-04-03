package Lesson14_Queue.CodeTime;

import java.util.Comparator;

public class PurchseComparator implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
