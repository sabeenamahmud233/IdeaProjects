package Oops;

public class ConstructorExamples {

    /* Constructor:

    1. Constructor is a bloc similar to method having same name as that of class
    2. Constructor cannot have any return type
    3. The only modifiers applicable for constructors are public, private, default and protected
    4. Constructors are executes immediately as soon we create the object of the class

    */


    String dogColor;
    int dogAge;

    public ConstructorExamples(String dogColor, int dogAge) {
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }
}
