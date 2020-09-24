package JavaLearning;

public class Polymorphism17 {
    public static void main(String[] args) {
        Bank abc = new BankABC();
        Bank def = new BankDEF();

        abc.setInterestRate(5);
        def.setInterestRate(7);
    }

    static class Bank {
        public void setInterestRate(double interestRate) {
            System.out.println("Interest Rate is: " + interestRate);
        }
    }

    static class BankABC extends Bank {
        @Override
        public void setInterestRate(double interestRate) {
            super.setInterestRate(interestRate);
        }
    }

    static class BankDEF extends Bank {
        @Override
        public void setInterestRate(double interestRate) {
            System.out.println("BankDEF interest rate is: " + interestRate);
        }
    }
}

