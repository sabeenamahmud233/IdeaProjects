package JavaLearning;

public class ArrayExplain06 {
    public static void main(String[] args) {
        /*
            int[] myIntArray = new int[3];
            int[] myIntArray = new int[]{1, 2, 3};
            int[] myIntArray = {1, 2, 3};
        */

        int[] arrayVar = {1, 2, 3, 4, 5};
        System.out.println(arrayVar[0]);
        System.out.println(arrayVar[1]);
        System.out.println(arrayVar[2]);
        System.out.println(arrayVar[3]);
        System.out.println(arrayVar[4]);
        System.out.println("+++++++++++++++++++");

        int i = 0;
        while (i < 5) {
            System.out.println(arrayVar[i]);
            i++;
        }

        System.out.println("+++++++++++++++++++");
        for (int j = 0; j < arrayVar.length; j++) {
            System.out.println(arrayVar[j]);
        }
    }
}
