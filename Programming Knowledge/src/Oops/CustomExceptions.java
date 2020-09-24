package Oops;

import java.util.Scanner;

class UncheckedExceptions extends RuntimeException {
    public UncheckedExceptions(String message) {
        super(message);
    }

    public UncheckedExceptions() {
        super("This is run time exception");
    }
}

class CheckedExceptions extends Exception {
    public CheckedExceptions(String message) {
        super(message);
    }

    public CheckedExceptions() {
        super("This is compile time exception");
    }
}

public class CustomExceptions {
    private static Scanner scanner = new Scanner(System.in);

    public void customDefinedExceptions() throws CheckedExceptions {
        VotingRight votingRight = new VotingRight();
        votingRight.voting();

        PollingRight pollingRight = new PollingRight();
        pollingRight.polling();
    }



    class VotingRight {
        public void voting() throws UncheckedExceptions {
            System.out.println("Enter your age: \r");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid value, Enter the age again: \r");
                scanner.next();
            }
            int age = scanner.nextInt();
            try {
                if (age < 18) {
                    throw new UncheckedExceptions("Can't vote now");
//                    throw new UncheckedExceptions();      // this will print default error
                } else {
                    System.out.println("You are allowd to vote");
                }
            } catch (UncheckedExceptions uce) {
                System.out.println(uce.getMessage());
            }
        }
    }

    class PollingRight {
        public void polling() throws CheckedExceptions {
            System.out.println("Enter your age: \r");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid value, Enter the age again: \r");
                scanner.next();
            }
            int age = scanner.nextInt();

            try {
                if (age < 18) {
                    throw new CheckedExceptions();
                } else {
                    System.out.println("You are eligible to vote");
                }
            } catch (CheckedExceptions ce) {
                System.out.println(ce.getMessage());
            }
        }
    }
}
