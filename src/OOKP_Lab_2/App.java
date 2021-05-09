package OOKP_Lab_2;

public class App {
    public static void main(String[] args) {

        ImmutableClass immutableClass = new ImmutableClass("Vasyl");
        ImmutableClass immutableClass1 = new ImmutableClass("Mykola");
        ImmutableClass immutableClass2 = new ImmutableClass("Connor");
        ImmutableClass immutableClass3 = new ImmutableClass("Megan");

        System.out.println(immutableClass3.getName());
        System.out.println(immutableClass.compareTo(immutableClass3));




    }
}
