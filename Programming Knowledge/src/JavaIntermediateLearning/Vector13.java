package JavaIntermediateLearning;

import java.util.Vector;

public class Vector13 {
    public static void main(String[] args) {
        VectorExplain ve = new VectorExplain();
        ve.vectorMethod();
    }
}

// Vector is a dynamic array

class VectorExplain {
    public void vectorMethod() {
        Vector<Integer> vector1 = new Vector<Integer>();
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);

        System.out.println(vector1.size());

        // Enhanced For Loop
        for (int i : vector1) {
            System.out.printf("%s ", i);
        }
        System.out.println();

        // Lambda Expression
        vector1.forEach(i -> System.out.printf("%s ", i));
        System.out.println();

        // Method Reference
        vector1.forEach(System.out::print);
        System.out.println();
    }
}
