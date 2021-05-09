package OOKP_Lab_2;

public class App {
    public static void main(String[] args) {

        ImmutableClass immutableClass = new ImmutableClass("Vasyl");
        ImmutableClass immutableClass1 = new ImmutableClass("Mykola");
        ImmutableClass immutableClass2 = new ImmutableClass("Connor");
        ImmutableClass immutableClass3 = new ImmutableClass("Megan");

        immutableClass.setAge(10);
        System.out.println(immutableClass.getAge());
        System.out.println(immutableClass3.getName());



    }
}
