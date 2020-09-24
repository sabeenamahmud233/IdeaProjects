package JavaLearning;
/*
    final keywords use:
    - final class cannot have subclass
    - final method cannot be overridden
    - final variable cannot initialize more than once
*/


public class FinalKeyword15 {
    public static final int number = 10;

    public static void main(String[] args) {
        System.out.println("Number value is: " + number);
//        number++;   // it will give an error: java: cannot assign a value to final variable number
        System.out.println("Number value is: " + number);
    }
}
