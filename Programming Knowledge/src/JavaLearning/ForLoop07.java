package JavaLearning;

public class ForLoop07 {
    public static void main(String[] args) {
        ForLoop07.method1();
        ForLoop07.method2();
    }

    public static void method1() {
        int[] arrayVar = {1, 2, 3, 4, 5};
        for (int j = 0; j < arrayVar.length; j++) {
            System.out.println(arrayVar[j]);
        }
    }

    public static void method2() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + "\t" + i*j);
            }
            System.out.println("\n+++++++++++++++++++\n");
        }
    }
}
