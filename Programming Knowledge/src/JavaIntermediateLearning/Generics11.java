package JavaIntermediateLearning;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Generics11 {
    private static ArrayList<Integer> grocery;

    public static void main(String[] args) {
//        NonGenericsClass ngc = new NonGenericsClass();
//        ngc.nonGenericsMethod();
//
//        System.out.println("\n-----------------------");
//
//        GenericsClass gc = new GenericsClass();
//        gc.genericsMethod();
        grocery = new ArrayList<Integer>();
        grocery.add(1);
        grocery.add(2);
        grocery.add(3);
        grocery.add(4);

        // Using Lambda expression for printing
        grocery.forEach(System.out::println);


        for (Integer a: grocery) {
            System.out.printf("%s ", a);
        }

        System.out.println();
        Container<Double> obj1 = new Container<Double>();
        obj1.value1 = 5.0;
        obj1.show();

        Container<Number> obj2 = new Container<Number>();
        obj2.showDetails(grocery);


        // Common Method for all type
        GenericWithAll gwa = new GenericWithAll();
        System.out.println(gwa.showData(9));
        System.out.println(gwa.showData(-1));
        System.out.println(gwa.showData("String"));
        System.out.println(gwa.showData(2.5));


        // Specific method for Integer type
        GenericWithLimited gmlt = new GenericWithLimited();
        System.out.println(gmlt.showData(9));
        System.out.println(gmlt.showData(-1));
//        System.out.println(gmlt.showData(2.9));     // This will not work here as we have specified the Integer type only
//        System.out.println(gmlt.showData("Hello")); // This will not work here as we have specified the Integer type only

        // Specific method for enhanced limit
    }
}

// Problem if we don't use Generic Method
// Here we have implemented two mwthod to print two different type of Arrays
class NonGenericsClass {
    public void nonGenericsMethod() {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6};
        Character[] charArray = new Character[]{'a', 'b', 'c', 'd', 'e', 'f'};

        printIntArray(intArray);
        System.out.println();
        printCharArray(charArray);
    }

    private void printCharArray(Character[] charArray) {
        for (Character c : charArray) {
            System.out.print(String.format("%s ", c));
        }
    }

    public void printIntArray(Integer[] intArray) {
        for (Integer i : intArray) {
            System.out.print(String.format("%s ", i));
        }
    }
}


// With Generic methods we don't have to implement the different methods for different type of array
// Here we have implemented just one method to print all different type of Arrays
class GenericsClass {
    public void genericsMethod() {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6};
        Character[] charArray = new Character[]{'a', 'b', 'c', 'd', 'e', 'f'};

        printArray(intArray);
        System.out.println();
        printArray(charArray);
    }

    private <T> void printArray(T @NotNull [] array) {
        for (T element : array) {
            System.out.printf("%s ", element);
        }
    }
}


class Container<T> {
    T value1;

    public Container() {
    }

    public Container(T value1) {
        this.value1 = value1;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void show() {
        System.out.println(value1.getClass().getName());
    }

    public void showDetails(ArrayList<? extends T> list) {
        System.out.println(list.getClass().getName());
    }
    // Here question marks must be a subclass of T
    // For Example Integer is Subclass of Number
    // And Number is subclass of Object
}


class GenericWithAll {
    public <T> T showData(T value) {
        return value;
    }
}

class GenericWithLimited {
    public <T extends Integer> T showData(T value) {
        return value;
    }
}

class CollectionsWithGenerics {
    int[] values1 = new int[]{1, 2, 3, 4, 5};
    Object[] value2 = new Object[]{"abc", "def", "ghi", "jkl", "mno"};
}

