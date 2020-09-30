package JavaIntermediateLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream15 {
    public static void main(String[] args) {
        Stream01 method1 = new Stream01();
        method1.streamMethod();

        Stream02 method2 = new Stream02();
        method2.streamMethod();

        Stream03 method3 = new Stream03();
        method3.streamMethod();

        Stream04 method4 = new Stream04();
        method4.streamMethod();

        Stream05 method5 = new Stream05();
        method5.streamMethod();

        Stream06 method6 = new Stream06();
        method6.streamMethod();
    }
}

class Stream01 {
    public void streamMethod() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(Stream01::printValue); // Method reference from class Stream15
    }

    public static void printValue(int value) {
        System.out.println(value);
    }
}

class Stream02 {
    public void streamMethod() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int result = 0;

        for (int i : list) {
            result += i;
        }
        System.out.println(result);


    }
}

class Stream03 {
    public void streamMethod() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));   // Using lambda expression
        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));  // Using method reference

    }
}

class Stream04 {
    public void streamMethod() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Explaining the Stream03 class method here

        Function<Integer, Integer> f = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer i) {
                return i * 2;
            }
        };

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i1, Integer i2) {
                return i1 + i2;
                // return i1 * i2;   // We can use any operator here
            }
        };

        Stream s1 = list.stream();      // 1,2,3,4,5
        Stream s2 = s1.map(f);          // 2,4,6,8,10
        Integer result = (Integer) s2.reduce(0, b);     // 0 + 2, 2 + 4, 6 + 6, 12 + 8, 20 + 10
        // Integer result = (Integer) s2.reduce(1, b);     // 0 + 2, 2 + 4, 6 + 6, 12 + 8, 20 + 10

        System.out.println(result);
    }
}

class Stream05 {
    public void streamMethod() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Further simplifying the Stream04 class code here

        // Function is used just once, so we can use anonymous class here
        // Same goes for BinaryOperator

        /*

        Stream s1 = list.stream();      // 1,2,3,4,5
        Stream s2 = s1.map(new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer i) {
                return i * 2;
            }
        });     // 2,4,6,8,10

        */

        // further simplifying the above code using lambda expression
        // because Function is @FunctionalInterface
        // we can simple write it dow like below, also keep in mind generics

        Stream<Integer> s1 = list.stream();         // 1,2,3,4,5
        Stream<Integer> s2 = s1.map(i -> i * 2);    // 2,4,6,8,10

        /*

        Integer result = (Integer) s2.reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i1, Integer i2) {
                return i1 + i2;
            }
        });     // 0 + 2, 2 + 4, 6 + 6, 12 + 8, 20 + 10

        */

        // further simplifying the above code using lambda expression
        // because BinaryOperator is @FunctionalInterface
        // we can simple write it dow like below, also keep in mind generics

        Integer result = (Integer) s2.reduce(0, (i, j) -> (i + j));
        System.out.println(result);

        // so if we summarise all than it will reduce the whole code in just 4 lines
        // as mentioned below

        /*

        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.map(i -> i * 2);
        Integer result = (Integer) s2.reduce(0, (i, j) -> (i + j));
        System.out.println(result);

        */

        // Now if we want to make this code more efficient
        // like below

        /*

        Stream<Integer> s1 = list.stream();
        Integer result = s1.map(i -> i * 2).reduce(0, (i, j) -> (i + j));
        System.out.println(result);

        */

        // Now if we want to make this code more efficient
        // like below

        /*

        Integer result = list.stream().map(i -> i * 2).reduce(0, (i, j) -> (i + j));
        System.out.println(result);

        */

        // Now if we want to make this code more efficient
        // we can reduce the code in just one line
        // like below

        /*

        System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));

        */

        // We can use this code using method reference as below, both will produce same output

        /*

        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));

        */
    }
}

// Stream Filter Explained
class Stream06 {
    public void streamMethod() {
        List<Integer> list = Arrays.asList(11, 17, 256, 200, 125, 121, 555, 237, 600);

        /*

        int result = 0;
        for (int i : list) {
            if (i%5 == 0) {
                result += i;
            }
            // System.out.println(result);
        }
        System.out.println(result);

        */

        // So here we can reduce the whole code in just a single line
        // Using the filter method mentioned below

        System.out.println(list.stream()
                               .filter(i -> i % 5 == 0)
                               .reduce(0, Integer::sum));



        // Explaining the above code (Filter Code)

        /*

        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer % 5 == 0;
            }
        };

        System.out.println(list.stream()
                .filter(p)
                .reduce(0, Integer::sum));

        */
    }
}