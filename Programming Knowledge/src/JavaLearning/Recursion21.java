package JavaLearning;

import java.util.Scanner;

public class Recursion21 {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.calculateFactorial();

        FactorialWithRecursion factorialWithRecursion = new FactorialWithRecursion();
//        System.out.println(factorialWithRecursion.factorialCalculate(0));
//        System.out.println(factorialWithRecursion.factorialCalculate(1));
        System.out.println(factorialWithRecursion.factorialCalculate(12));
    }
}

class Factorial {
    public void calculateFactorial() {
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number for that you want factorial: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Value, Enter Again: ");
            scanner.next();
        }
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("Factorial of: " + number + " is: " + result);
        } else {
            for (int i = number; i > 0; i--) {
                result *= i;
            }
            System.out.println("Factorial of: " + number + " is: " + result);
        }
    }
}

class FactorialWithRecursion {
    public int factorialCalculate(int number) {
        if (number <= 0) {
            return 0;
        }
        else if (number == 1) {
            return 1;
        }
        else {
            return (number * factorialCalculate(number - 1));
        }
    }
}