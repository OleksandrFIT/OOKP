package Lesson14_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Application {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>(); //FIFO (offer/poll/peek)
        queue.offer(10);
        queue.offer(4);
        queue.offer(3);
        queue.offer(5);

        queue.poll();
    //    System.out.println(queue.peek());

        ArrayDeque<Integer> deQueue = new ArrayDeque<>(); //LIFO (push/poll/peek)
        deQueue.push(1);
        deQueue.push(2);
        deQueue.push(3);
        deQueue.push(4);
        deQueue.push(5);  //  добавляє в кінець
        deQueue.offer(6); //  добавляє в початок

        System.out.println(deQueue);
        System.out.println(deQueue.peek());

        deQueue.poll();
        deQueue.poll();
        deQueue.poll();
        deQueue.poll();
        System.out.println(deQueue.peek());

    }

}
