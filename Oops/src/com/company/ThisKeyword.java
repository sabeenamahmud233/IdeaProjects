package com.company;

public class ThisKeyword {

    public void thisKeywordImplements () {
        Animal animal = new Animal();
        animal.showDetails("Huskey", 20);
        animal.showAnimal("Bulldog", 25);
        animal.show("German Shepard", 25);

        Horse horse = new Horse();
        horse.setValue("Alpha");
        horse.show();
        horse.setName("Beta");
        horse.showName();

    }

    public class Animal {
        String name;
        int age;

        public void showDetails(String animalName, int animalAge) {
            name = animalName;
            age = animalAge;
            System.out.println("Animal name is: " + name + " and age is: " + age);
        }

        public void showAnimal(String animalName, int animalAge) {
            name = animalName;
            age = animalAge;
            System.out.println("Dog name is: " + name + " and age is: " + age);
        }

        /*public void show(String name, int age) {
            name = name;
            age = age;
            System.out.println("Dog name is: " + name + " and age is: " + age);
        }*/

        // above methos should be implemeted like below method

        public void show(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Dog name is: " + name + " and age is: " + age);
        }
    }
}

class Horse {

    // wrong way of implementation
    String name;
    public void setValue(String name) {
        name = name;
    }

    public void show() {
        System.out.println(name);
    }

    // right way of implementation
    String newName;
    public void setName(String newName) {
        this.name = newName;
    }

    public void showName() {
        System.out.println(name);
    }
}
