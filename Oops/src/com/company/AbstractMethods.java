package com.company;

public class AbstractMethods {

    public void abstractExample() {
        Animal animal = new Animal() {
            @Override
            void run() {
                System.out.println("Animal is running");
            }
        };
        animal.run();
        animal.eat();

        Dog dog = new Dog();
        dog.run();

        Cat cat = new Cat();
        cat.run();
    }

    abstract class Animal {
        //abstract method will be instantiated when creating an object for the class.
        abstract void run(); // there will be no body for abstract method in abstract class

        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    public class Dog extends Animal {

        // if a class inherited form a abstract class than it must override all the abstract methods
        @Override
        void run() {
            System.out.println("This is abstract method implementation in Dog class");
        }
    }

    public class Cat extends Animal {

        @Override
        void run() {
            System.out.println("This is abstract method implementation in Cat class");
        }
    }

}
