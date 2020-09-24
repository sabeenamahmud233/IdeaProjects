package JavaIntermediateLearning;

import java.util.PriorityQueue;

public class PriorityQueue09 {
    public static void main(String[] args) {
        QueueClass qclass = new QueueClass();
        qclass.queueMethod();
    }
}

class QueueClass {
    public void queueMethod() {
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.offer("First");
        q.offer("Second");
        q.offer("Third");

        System.out.printf("%s, ", q);
        System.out.println();

        System.out.printf("%s, ", q.peek());    // It will give the top priority item that is "First"
        System.out.println();

        System.out.printf("%s, ", q);
        System.out.println();

        System.out.printf("%s, ", q.poll());    // it will remove the top pririty item that is "First"
        System.out.println();

        System.out.printf("%s, ", q);
        System.out.println();
    }
}
