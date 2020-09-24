package com.company;

public class ObjectOrientedProgramming {

    /* there are 6 pillars of OOPs
        1. Classes 2. Objects & Methods 3. Inheritance
        4. Polymorphism 5. Abstraction 6. Encapsulation

        Class is the collection of the object
        Class is not a real world entity, it is just a template/ blue print / prototype
        class does not occupy memory

        Syntax:
        access-modifier class ClassName
        {
            Methods
            Constructors
            Fields
            Blocks
            Nested Class
        }


        public class Animal {
            public void dog (String run) {
                Systen.out.print("Dog is running");
            }
    */


    /* Methods: A set of codes which performs perticular task
        -> code reusability
        -> code optimization

        Syntax:
        Access-modifier Return-Type MethodName (List of parameters)
        Task
    */


    /* Object:
        1. Object is an instance of the class
        2. Object is a real world entity
        3. Object occupy memory

        Objects consists of:
        -> Identity: Name
        -> State/Attribute: Color, Bread, Age
        -> Behaviour: Eat, Run

        How to create an Object:
        -> Using new keyword
        -> Using new instance
        -> Using clone() method
        -> Using deserialization
        -> factory method

    Syntax:
        Declaration: Animal dog
        Instantiation: new Animal()
        Initialization: Using constructor



        ClassName ObjectName = new ClassName();

    */

    String dogColor;
    int dogAge;

    public static void dog() {

        System.out.println("Dog is running.");
    }

    public void cat() {
        System.out.println("Cat is running");
    }

    public void dogDetails(String color, int age) {
        dogColor = color;
        dogAge = age;
        System.out.println("This dog color is " + dogColor + " and age is " + dogAge);
    }

}


