package JavaLearning;

public class Abstract19 {
    public static void main(String[] args) {
        AbstractClass mainClass = new AbstractClass() {
            @Override
            void method1() {
                System.out.println("This is main abstract method1");
            }

            @Override
            void method2() {
                System.out.println("This is main abstract method2");
            }
        };

        mainClass.method1();
        mainClass.method2();

        AbstractClass1 absClass1 = new AbstractClass1();
        absClass1.method1();
        absClass1.method2();
    }
}

abstract class AbstractClass {
    abstract void method1();
    abstract void method2();
}

class AbstractClass1 extends AbstractClass {

    @Override
    void method1() {
        System.out.println("This is abstract method1");
    }

    @Override
    void method2() {
        System.out.println("This is abstract method2");
    }
}
