package JavaLearning;

public class MethodOverriding18 {
    public static void main(String[] args) {
        BankABC abc = new BankABC();
        BankDEF def = new BankDEF();

        abc.setInterestRate(5);
        def.setInterestRate(7);
    }
}

class Bank {
    public void setInterestRate(double interestRate) {
        System.out.println("Interest Rate is: " + interestRate);
    }
}

class BankABC extends Bank {
    @Override
    public void setInterestRate(double interestRate) {
        super.setInterestRate(interestRate);
    }
}

class BankDEF extends Bank {
    @Override
    public void setInterestRate(double interestRate) {
        System.out.println("BankDEF interest rate is: " + interestRate);
    }
}