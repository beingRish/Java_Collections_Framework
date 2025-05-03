package Lecture22;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeueDemo {
    public static void main(String[] args) {
        // non-blocking, thread-safe double-ended queue
        // CAS
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element 1");
        deque.addLast("Element 0");
        deque.addLast("Element 2");
        System.out.println(deque);

        String first = deque.removeFirst();
        String last = deque.removeLast();
    }
}
