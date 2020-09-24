package JavaLearning;

public class Threads31 {
    public static void main(String[] args) {
        Threads threadObj1 = new Threads();
        threadObj1.start();

        Threads threadObj2 = new Threads();
        threadObj2.start();
    }
}

class Threads extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Value is: " + i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}