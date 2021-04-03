package Lesson14_Queue.CodeTime;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        //введення товару (створ список ы в нього закидаэмо список з методу)
        List<Purchase> stuff = createAndRead();

        //printPurchasesInAlphabet(stuff);


        printLinkedHashSet(stuff);

        //виведення в порядку зменшення к-ті через TreeSet
        //decreaseTreeSet(stuff);

        printWithHashCode(stuff);

    }

    private static void printLinkedHashSet(List<Purchase> stuff) {
        Set<Purchase> articleLinkedHashSet = new LinkedHashSet<>();
        articleLinkedHashSet.addAll(stuff);
        System.out.println(articleLinkedHashSet);
    }


    //обробка інформації (введення товару) Ctrl+Alt+ M
    private static List<Purchase> createAndRead() {
        System.out.println("Введіть к-ть найменувань: i = ");
        Scanner scan_i = new Scanner(System.in);
        int i = scan_i.nextInt();


        List<Purchase> stuff = new ArrayList<>();

        for (int k = 0; k < i; k++){


            Scanner scan_name = new Scanner(System.in);
            String name = scan_name.next();

            Scanner scan_num = new Scanner(System.in);
            int number = scan_num.nextInt();


            Purchase purchase = new Purchase(name, number);

            // add new info to stuff
            stuff.add(purchase);


        }

        return stuff;

    }


    private static void printPurchasesInAlphabet(List<Purchase> stuff){
        PurchseComparator purchseComparator = new PurchseComparator();
        Set<Purchase> purchase = new TreeSet<>(purchseComparator);
        purchase.addAll(stuff);

        System.out.println("Sorted by Alphabet (ABC)");
        System.out.println(purchase);
    }

    //виведення в порядку зменшення к-ті через TreeSet
     public static void decreaseTreeSet(List<Purchase> stuff){
        //перевизначаєм метод compare
        Set<Purchase> articleDecreaseTreeSet = new TreeSet<>(new Comparator<Purchase>() {
            @Override
            public int compare(Purchase o1, Purchase o2) {
                int result = Integer.compare(o2.getNumber(), o1.getNumber());
                return result;
            }
        });
        articleDecreaseTreeSet.addAll(stuff);
         System.out.println("Decrease : " + articleDecreaseTreeSet);
     }


     //виведення об'єктів за хеш кодом
    public static void printWithHashCode(List<Purchase> stuff){
        Set<Purchase> hashCode = new HashSet<>();
        hashCode.addAll(stuff);

        for (Purchase p: hashCode){
            System.out.println("Element:" + p + " HashCode "+ p.hashCode() );
        }
    }


}
