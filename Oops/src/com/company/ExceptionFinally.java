package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFinally {

    public void throwsExample() {
        ThrowsException throwsException = new ThrowsException();
//        throwsException.tryBlock();
//        throwsException.throwsExceptions();
//        throwsException.throwsExceptions1();

//        ThrowsException1 throwsException1 = new ThrowsException1();
//        throwsException1.division1();
//        throwsException1.division2();
//        throwsException1.division3();
//        throwsException1.division4();

//        Voting voting = new Voting();
//        voting.votingRight();

        Voting1 voting1 = new Voting1();
        voting1.votingRight();
    }

    static int a, b, c;
    private static Scanner scanner = new Scanner(System.in);
    public void finallyBlock () {
        System.out.println("Enter the values for division:");
        System.out.println("Enter first value:");
        while(!scanner.hasNextInt()) {
            System.out.println("You didn't enter the valid integer value.");
            System.out.println("Please Enter first value again:");
            scanner.next();
        }
        this.a = scanner.nextInt();

        System.out.println("Enter second value:");
        while(!scanner.hasNextInt()) {
            System.out.println("You didn't enter the valid integer value.");
            System.out.println("Please Enter second value again:");
            scanner.next();
        }
        this.b = scanner.nextInt();

        try {
//            System.exit(0); // this will exit the JVM and finally block won't execute
            this.c = a/b;
        } catch (ArithmeticException | NumberFormatException ae) {
//            ae.printStackTrace();
            System.out.println(ae.getMessage());
        } finally {
            if (b == 0) {
                System.out.println("You can not divide by zero");
            } else {
                System.out.println("divison result is: " + a + "/" + b + " = " + c);
            }
        }
    }

    public class ThrowsException {
        int a,b,c;
        public void throwsExceptions () throws ArithmeticException, NumberFormatException, InputMismatchException {
            System.out.println("Enter the values for division:");
            System.out.println("Enter first value:");
            while(!scanner.hasNextInt()) {
                System.out.println("You didn't enter the valid integer value.");
                System.out.println("Please Enter first value again:");
                scanner.next();
            }
            a = scanner.nextInt();

            System.out.println("Enter second value:");
            while(!scanner.hasNextInt()) {
                System.out.println("You didn't enter the valid integer value.");
                System.out.println("Please Enter second value again:");
                scanner.next();
            }
            b = scanner.nextInt();
            c = a/b;
            System.out.println(c);

        }

        public void throwsExceptions1 () {
            int a, b, c;
            System.out.println("Enter the values for division:");
            System.out.println("Enter first value:");
            while(!scanner.hasNextInt()) {
                System.out.println("You didn't enter the valid integer value.");
                System.out.println("Please Enter first value again:");
                scanner.next();
            }
            a = scanner.nextInt();

            System.out.println("Enter second value:");
            while(!scanner.hasNextInt()) {
                System.out.println("You didn't enter the valid integer value.");
                System.out.println("Please Enter second value again:");
                scanner.next();
            }
            b = scanner.nextInt();
            if (b == 0) {
                throw new ArithmeticException("Divide by zero");
            }
            c = a/b;
            System.out.println(c);

        }

        public void tryBlock() {
            try {
                System.out.println("This is in try block");

            } catch (Exception e) {
                e.printStackTrace();

            } finally {
                System.out.println("This is in finally block");
            }
        }
    }

    public class ThrowsException1 {
        public void division1() throws ArithmeticException{
            int a = 20, b = 0, c;
            c = a/b;
            System.out.println(c);
        }

        public void division2() {
            try {
                int a = 20, b = 0, c;
                c = a/b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        public void division3() {
            try {
                int a = 20, b = 0, c;
                c = a/b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is finally bloack that will execute all the time.");
            }
        }

        public void division4() {
            try {
                int a = 20, b = 0, c;
                c = a/b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    System.out.println("This is try block in finally block");
                } catch (Exception e) {
                    System.out.println("This is catch block in finally block, this will be execute if there is error in try block");
                }

            }
        }
    }

    static class YoungerAgeException extends RuntimeException {
        public YoungerAgeException(String msg) {
            super(msg);
        }
    }

    class Voting {
        public void votingRight() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age: ");
            while(!scanner.hasNextInt()) {
                System.out.println("You didn't enter the valid integer value.");
                System.out.println("Please Enter your age again:");
                scanner.next();
            }

            int age = scanner.nextInt();

            if (age < 18) {
                throw new YoungerAgeException("You are not eligible to vote.");
                // this will throw the exception here and terminate the program
                // throw creates exception object manually and handover to JVM
                // this exception will be handle by JVM here
                // throw is best for customized exception
                // to handle this exception by us we have to implement the catch block here so program can work continue
                // this will be explained in Voting1 class
            } else {
                System.out.println("You have the voting right so you can vote now.");
            }
        }
    }

    class Voting1 {
        public void votingRight() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age: ");
            while(!scanner.hasNextInt()) {
                System.out.println("You didn't enter the valid integer value.");
                System.out.println("Please Enter your age again:");
                scanner.next();
            }

            int age = scanner.nextInt();

            try {
                if (age < 18) {
                    throw new YoungerAgeException("You are not eligible to vote.");
                    // throw exception is used for customised exception or unchecked exception
                    // this will throw the exception here and terminate the program
                    // this exception will be handle by JVM here
                    // to handle this exception by us, we have to implement the catch block here so program can work continue
                    // this will be explained in Voting1 class
                } else {
                    System.out.println("You have the voting right so you can vote now.");
                }
            } catch (YoungerAgeException yae) {
                yae.printStackTrace();
            }

            // Here exception was handled by user so if we want to execute something here, it will execute normally
            // For example we just want to print "Code executed successfully"

            System.out.println("Code executed successfully");
        }
    }
}
