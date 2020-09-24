package JavaLearning;

public class ThreadJoin33 {

    private static int count = 0;

    public static synchronized void increaseCount() {
        count++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " Value is: " + String.format("%5s", i));
                    increaseCount();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " Value is: " + String.format("%5s", i));
                    increaseCount();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Value of the count is: " + String.format("%5s", count));
    }
}