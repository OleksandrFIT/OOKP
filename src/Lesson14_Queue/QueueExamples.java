package Lesson14_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(5);
        queue.add(9);
        queue.add(7);
        queue.add(14);
       // System.out.println(queue);

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(14);
        priorityQueue.add(789);
        priorityQueue.add(2);

        System.out.println(priorityQueue);

    }

}
