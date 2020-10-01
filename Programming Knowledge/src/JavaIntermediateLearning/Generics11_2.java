package JavaIntermediateLearning;

import java.util.ArrayList;
import java.util.List;

public class Generics11_2 {

    private static List<Integer> list1 = List.of(1, 2, 3, 4, 5);
    private static List<Double> list2 = List.of(1.2, 2.3, 3.4, 4.5, 5.1);
    private static List<Float> list3 = List.of(1.2f, 2.3f, 3.4f, 4.5f, 5.1f);
    private static List<Long> list4 = List.of(11L, 12L, 13L, 14L, 15L);
    private static List<Character> list5 = List.of('a', 'b', 'c', 'd', 'e');
    private static List<String> list6 = List.of("apple", "orange", "pepper", "papaya", "banana");
    private static List<Number> list7 = new ArrayList<>();


    public static void main(String[] args) {
        Generics02<Integer> instance1 = new Generics02<>();
        instance1.commonGenericMethod1(1);
        instance1.commonGenericMethod1(2);
        System.out.println(instance1.toString());
        System.out.println(instance1.getValue(1));

        System.out.println("*********************************");

        Generics02<Float> instance2 = new Generics02<>();
        instance2.commonGenericMethod1(1.1f);
        instance2.commonGenericMethod1(2.1f);
        System.out.println(instance2.toString());
        System.out.println(instance2.getValue(0));

        System.out.println("*********************************");


        Generics03<Integer> instance3 = new Generics03<>();
        instance3.commonGenericMethod1(1);
        instance3.commonGenericMethod1(2);
        System.out.println(instance3.toString());
        System.out.println(instance3.getValue(1));

        System.out.println("*********************************");

        Generics03<Float> instance4 = new Generics03<>();
        instance4.commonGenericMethod1(1.1f);
        instance4.commonGenericMethod1(2.1f);
        System.out.println(instance4.toString());
        System.out.println(instance4.getValue(0));

        System.out.println("*********************************");
        /*
        Generics03<String> instance5 = new Generics03<>();
        */
        
        // If we go for the String type it will now work
        // As string is not the sub type of the Number class

        System.out.println("*********************************");

    }
}

class Generics02<T> {

    private List<T> list = new ArrayList<>();

    // Add Element in the list
    public void commonGenericMethod1(T t) {
        list.add(t);
    }

    // Remove element from the list
    public void commonGenericMethod2(T t) {
        list.remove(t);
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return list.toString();
    }

    // Return method
    public T getValue(int i) {
        return list.get(i);
    }
}


// Limiting the class for particular type
class Generics03<T extends Number> {

    private List<T> list = new ArrayList<>();

    // Add Element in the list
    public void commonGenericMethod1(T t) {
        list.add(t);
    }

    // Remove element from the list
    public void commonGenericMethod2(T t) {
        list.remove(t);
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return list.toString();
    }

    // Return method
    public T getValue(int i) {
        return list.get(i);
    }
}