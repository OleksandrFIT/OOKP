package Lesson16_present.CodeTime;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Person, Account> personAccountMap = new HashMap<>();

        Person person = new Person("Vasyl", "email@gmail.com", 25);
        Person person1 = new Person("Ivan", "ivanemail@gmail.com", 28);
        Person person2 = new Person("Andriy", "andriyemail@gmail.com", 28);
        Account account = new Account(1, 123, "1email@gmail.com");
        Account account1 = new Account(2, 1232, "ivanemail@gmail.com");
        Account account2 = new Account(3, 12323463, "andriyemail@gmail.com");
        personAccountMap.put(person, account);
        personAccountMap.put(person1, account1);
        personAccountMap.put(person2, account2);

        System.out.println(personAccountMap);
        personAccountMap.remove(person2);
        System.out.println("After person account 2 is removed");
        System.out.println(personAccountMap);
    }
}
