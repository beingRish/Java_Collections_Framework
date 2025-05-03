package Lecture22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

//        System.out.println(queue1.remove());  // throws exception if empty
        System.out.println(queue1.poll());

//        System.out.println(queue1.element());  // throws exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));
        System.out.println(queue2.offer(2));
        System.out.println(queue2.offer(3));

    }
}
