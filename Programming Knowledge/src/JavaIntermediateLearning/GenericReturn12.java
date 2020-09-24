package JavaIntermediateLearning;

public class GenericReturn12 {
    public static void main(String[] args) {
        GenericReturn gr = new GenericReturn();
        gr.genericsMethod(5, 12, 1);
        gr.genericsMethod(5, 5, 5);
        gr.genericsMethod(0, -22, 3);
    }
}

class GenericReturn {

    //      GenericMethod           GenericReturnType   Returning Type a, b, c
    public <T extends Comparable<T>> T genericsMethod(T a, T b, T c) {
        T value1 = a;
        T value2 = b;
        T value3 = c;

        if (value1.equals(value2) && value3.equals(value1)) {
            System.out.println("All three data are same");
            return a;
        } else if (value1.compareTo(value2) > 0 && value1.compareTo(value3) > 0) {
            System.out.println(a + " is the greatest value");
            return a;
        } else if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0) {
            System.out.println(b + " is the greatest value");
            return b;
        } else {
            System.out.println(c + " is the greatest value");
            return c;
        }
    }
}

class GenericReturn2 {
    public <T> T stringShow(T a, T b) {
        T value1 = a;
        T value2 = b;
        T value3;

        return a;
    }
}
