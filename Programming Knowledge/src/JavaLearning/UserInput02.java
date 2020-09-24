package JavaLearning;

import java.util.Scanner;

public class UserInput02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Value, Enter Again: ");
            scanner.next();
        }
        int intValue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have entered: " + intValue);


        System.out.println();
        System.out.println("Enter Any Double Number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid Value, Enter Again: ");
            scanner.next();
        }
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("You have entered: " + doubleValue);

        System.out.println();
        System.out.println("Enter a string: ");

        String stringValue = scanner.next();
        scanner.nextLine();
        System.out.println("You have entered: " + stringValue);
    }
}
