package Lesson14_Queue.CodeTime;

import java.util.Objects;

public class Purchase {

    private String name;
    private int number;

    public Purchase(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    /**
     * хеш-код рахується неправильно із самого початку
     * перевизначаємо метод hashCode() and equals()
     * хеш- код повинен вираховуватись по кожному полю
     * якщо хеш код однаовий, то це не значить, що обєкти однакові
     * якщо обєкти однакрві, то ХЕШ- Код завджди однаковий
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // дивимось чи силки на обэкти вказують на одну комырку памяті (чи це один обєкт)
        if (o == null || getClass() != o.getClass()) return false; //перевіряємо чи елементи одного типу
        Purchase purchase = (Purchase) o;
        return number == purchase.number && Objects.equals(name, purchase.name); //обєкти однакові якщо мають однакові поля
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
