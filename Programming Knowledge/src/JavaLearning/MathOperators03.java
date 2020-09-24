package JavaLearning;

public class MathOperators03 {
    public static void main(String[] args) {
        int x, y, result;
        x = 17;
        y = 3;
        result = x + y;
        System.out.println("Addition is: " + result);
        System.out.println();

        result = x - y;
        System.out.println("Subtraction is: " + result);
        System.out.println();

        result = x * y;
        System.out.println("Multiplication is: " + result);
        System.out.println();

        result = x / y;
        System.out.println("Division is: " + result);
        System.out.println();

        result = x % y;
        System.out.println("Remainder is: " + result);
        System.out.println();

        x++;
        y += 1;

        System.out.println("Value of x after increment: " + x);
        System.out.println("Value of x after increment: " + y);

        x--;
        y -= 1;

        System.out.println("Value of x after decrement: " + x);
        System.out.println("Value of x after decrement: " + y);

    }
}
