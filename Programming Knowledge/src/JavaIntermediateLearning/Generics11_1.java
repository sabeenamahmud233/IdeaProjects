package JavaIntermediateLearning;

import java.util.ArrayList;
import java.util.List;

public class Generics11_1 {

    private static List<Integer> list1 = List.of(1, 2, 3, 4, 5);
    private static List<Double> list4 = List.of(1.2, 2.3, 3.4, 4.5, 5.1);
    private static List<Number> list5 = new ArrayList<Number>();
    private static List<Character> list2 = List.of('a', 'b', 'c', 'd', 'e');
    private static List<String> list3 = List.of("apple", "orange", "pepper", "papaya", "banana");

    public static void main(String[] args) {
        Generics01 instance1 = new Generics01();
        instance1.voidGenericsMethod(5);
        instance1.voidGenericsMethod("Hello");
        instance1.voidGenericsMethod('a');

        System.out.println("*********************************");
        System.out.println(instance1.returnGenericMethod(5));
        System.out.println(instance1.returnGenericMethod(5.5));
        System.out.println(instance1.returnGenericMethod(5.2f));
        System.out.println(instance1.returnGenericMethod(52525L));

        System.out.println("*********************************");
        System.out.println(instance1.extendedReturnGenericMethod(1));
        System.out.println(instance1.extendedReturnGenericMethod(1.2));
        System.out.println(instance1.extendedReturnGenericMethod(1254L));
        System.out.println(instance1.extendedReturnGenericMethod(1));
        System.out.println(instance1.extendedReturnGenericMethod("Hello"));
        System.out.println(instance1.extendedReturnGenericMethod('a'));

        System.out.println("*********************************");
        System.out.println(instance1.upperBoundGenericMethod(list1));
        System.out.println(instance1.upperBoundGenericMethod(list4));

        System.out.println("*********************************");

        instance1.lowerBoundGenericMethod(list5);
        list5.forEach(System.out::println);
        System.out.println("*********************************");




        System.out.println("*********************************");


    }
}

class Generics01 {

    public <T> void voidGenericsMethod(T t) {
        System.out.println(t);
    }

    public <T> T returnGenericMethod(T t) {
        return t;
    }

    public <T extends Number> T extendedReturnGenericMethod(T t) {
        return t;
    }

    public <T extends String> T extendedReturnGenericMethod(T t) {
        return t;
    }

    public <T extends Character> T extendedReturnGenericMethod(T t) {
        return t;
    }

    // Upper Bound Generics Example
    // Upper bound -> type of list can be any subclass type of extended class
    // Here type could be Integer, Double, Float, Long any of them as all are sub class of Number class
    // Helps in implementing the common logic
    public Number upperBoundGenericMethod(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Lower Bound Generics Example
    // Lower bound -> type of list can be any subclass type of extended class
    // Here type could be Integer, Double, Float, Long any of them as all are sub class of Number class
    // Helps to add different types or subtype if extended class

    public void lowerBoundGenericMethod(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.2);
        numbers.add(134L);
        numbers.add(1.2345F);
    }
}
