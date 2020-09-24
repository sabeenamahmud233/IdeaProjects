package JavaLearning;

public class MethodExplain09 {
    static int a, b, result;

    public static void main(String[] args) {
        noReturnMethod();
        intReturnMethod();
        System.out.println("Addition of " + a + " and " + b + " is: " + intReturnMethod());
        booleanReturnMethod();
    }

    public static void noReturnMethod() {
        System.out.println("Hello World");
    }

    public static int intReturnMethod() {
        a = 10;
        b = 20;
        result = a + b;
        return result;
    }

    public static boolean booleanReturnMethod() {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
            return true;
        } else {
            System.out.println(b + " is greater than " + a);
            return false;
        }
    }

}
