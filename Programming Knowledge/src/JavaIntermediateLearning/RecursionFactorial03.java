package JavaIntermediateLearning;

public class RecursionFactorial03 {
    public static void main(String[] args) {
        FactorialExample factorialWithRecursion = new FactorialExample();
        System.out.println(factorialWithRecursion.factorial(5));
    }
}

class FactorialExample {

    public int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}