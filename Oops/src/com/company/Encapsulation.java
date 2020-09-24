package com.company;

public class Encapsulation {

    public void encapsulationImplement() {
        Animal animal = new Animal();
        animal.setName("Labrador");
        animal.setAge(12);
        animal.showDetails();

        Dog dog = new Dog();
        dog.showDetails();
    }
}

class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Animal's Name is: " + getName());
        System.out.println("Animal's Age is: " + getAge());

    }
}

class Dog extends Animal {
    @Override
    public void showDetails() {
//        super.age = 20;     // this will not work as it is private variable
        setName("Huskey");      // we can only set and get the name and age using setter and getter methods
        setAge(20);
//        super.showDetails();       // we can use the super method or define one of our own here

        System.out.println("Dog's Name is: " + getName());
        System.out.println("Dog's Age is: " + getAge());

    }
}
