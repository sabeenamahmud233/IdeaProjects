package JavaLearning;

import java.util.Scanner;

public class SwitchCase05 {
    public static void main(String[] args) {

        int intValue = 2;

        switch (intValue) {
            case 1:
                System.out.println("Good");
                break;

            case 2:
                System.out.println("Best");
                break;

            case 3:
                System.out.println("Brilliant");
                break;

            case 4:
                System.out.println("Excellent");
                break;

            case 5:
                System.out.println("Extra Ordinary");
                break;
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Integer Value: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Only Integer value is allowed, Enter Again: ");
            scanner.next();
        }

        int userValue = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format(userValue + " * " + i + "\t = " + "%3d",(userValue * i)));
        }

        int a  = 0;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("==========================");

        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b <= 10);

    }
}
