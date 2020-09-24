package JavaLearning;

interface InterfaceExample {
    default void show() {
        System.out.println("Interface method");
    }

    static void run() {
        System.out.println("This is static run method in Interface");
    }

    void eat();

    public abstract void sleep();

    private void speed() {
        System.out.println("This is private method of interface");  // can't be access in the inheritated class
    }
}

public class Interface20{
    public static void main(String[] args) {
        InterfaceExplain inter = new InterfaceExplain();
        inter.eat();
        inter.sleep();
//        inter.speed();  // private method so can't accessed
        inter.show();
//        inter.run();    // static method can't be instantiated
        InterfaceExample.run(); // Static method may be invoked on containing interface class only
    }


}

class InterfaceExplain implements InterfaceExample {
    @Override
    public void eat() {
        System.out.println("This is eat method in the class");
    }

    @Override
    public void sleep() {
        System.out.println("This is sleep method in the class");
    }
}

