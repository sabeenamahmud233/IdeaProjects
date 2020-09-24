package JavaLearning;

public class RunnableInterface32 {
    public static void main(String[] args) {
        RunnableInterface runIntObj = new RunnableInterface();

        Thread threadObj1 = new Thread(runIntObj);
        threadObj1.start();

        Thread threadObj2 = new Thread(runIntObj);
        threadObj2.start();

        // Creating single thread in main method
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i <= 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " Value is: " + i);
                }
            }
        });
        t1.start();
    }
}

class RunnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Value is: " + i);
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
