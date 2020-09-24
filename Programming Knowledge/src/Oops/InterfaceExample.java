package Oops;

public class InterfaceExample {

    public void interfaceImplement() {
        Animal animal = new Animal();
        animal.eat();
        animal.show();
        animal.eatTwo();
        animal.showTwo();
    }

    interface interfaceOne {

        int a = 5, b = 10;

        default void show() {
            System.out.println("Interface method");
        }

        static void run() {
            System.out.println("This is static run method in Interface");
        }

        void eat();

//        public abstract void sleep();

        private void speed() {
            System.out.println("This is private method of interface");
        }
    }

    interface interfaceTwo {

        int x = 10, y = 20;

        default void showTwo() {
            System.out.println("Interface method");
        }

        void eatTwo();
    }

    class Animal implements interfaceOne, interfaceTwo {
        @Override
        public void show() {
            System.out.println(a);
            System.out.println("This is method override");
        }

        @Override
        public void eat() {
            System.out.println(b);
            System.out.println("This is abstrace method override");
        }

        @Override
        public void showTwo() {
            System.out.println(a + " " + x);
            System.out.println(a + x);
            System.out.println("This method is from second interface");
        }

        @Override
        public void eatTwo() {
            System.out.println(b + " " + y);
            System.out.println(b + y);
            System.out.println("This abstract method is from second intface");
        }
    }
}
