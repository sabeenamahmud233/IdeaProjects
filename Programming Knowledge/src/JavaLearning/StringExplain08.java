package JavaLearning;

import java.util.Arrays;

public class StringExplain08 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        String myString = "Hello World";
        System.out.println(myString);
        System.out.println(myString.length());
        System.out.println(myString.charAt(2));
        System.out.println(myString.substring(2, 5));
        System.out.println(myString.substring(2));
        System.out.println(myString.subSequence(2, 5));
        System.out.println(Arrays.toString(myString.split(":", 2)));
        System.out.println(myString.startsWith("hell"));
        System.out.println(myString.lastIndexOf('W'));
        System.out.println(myString.lastIndexOf('W', 2));
        System.out.println(myString.lastIndexOf("Hello"));
    }
}
