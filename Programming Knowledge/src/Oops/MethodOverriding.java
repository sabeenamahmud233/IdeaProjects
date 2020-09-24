package Oops;

public class MethodOverriding {

    public void overriding() {
        Animal animal = new Animal();
        animal.eat();
        animal.run("Animal");
        System.out.println(animal.speed(10));

        Dog dog = new Dog();
        dog.eat();
        dog.run("Dog");
        System.out.println(dog.speed(12));

        Cat cat = new Cat();
        cat.show();
    }

    interface interface1 {
        default void show() {
            System.out.println("this is interface method");
        }
    }

    public static class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }

        public void run(String name) {
            System.out.println(name + " is running.");
        }

        public Object speed(int animalSpeed) {
            return animalSpeed;
        }
    }

    public static class Dog extends Animal {
        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }

        @Override
        public void run(String name) {
            System.out.println(name + " is running.");
        }

        @Override
        public String speed(int dogSpeed) {
            return "Dog is running at the speed of " + dogSpeed;
        }
    }

    public static class Cat implements interface1 {
        @Override
        public void show() {
            System.out.println("Here interface is overridden in Cat class");
        }
    }
}
