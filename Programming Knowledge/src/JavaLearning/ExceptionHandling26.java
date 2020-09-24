package JavaLearning;

public class ExceptionHandling26 {
    public static void main(String[] args) {
        ExceptionHandling1 exceptionHandling1 = new ExceptionHandling1();
        exceptionHandling1.handleException();     // this will break the execution

        ExceptionHandling2 exceptionHandling2 = new ExceptionHandling2();
        exceptionHandling2.handleException();

        ExceptionHandling3 exceptionHandling3 = new ExceptionHandling3();
        exceptionHandling3.handleException();
    }
}

// not handling the exception here
class ExceptionHandling1 {
    int a, b, result;

    public void handleException() {
        a = 1000;
        b = 'a';    // it will convert char to ASCII value that is 97 for 'a'
        result = a / b;
        System.out.println(result);
    }
}

// handling the exception here
class ExceptionHandling2 {
    int a, b, result;

    public void handleException() {
        a = 10;
        b = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   // Here we can add multiple catch for more exceptions
    }
}

// handling the exception here with try catch finally block
class ExceptionHandling3 {
    int a, b, result;

    public void handleException() {
        a = 10;
        b = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("If you have return the value in the try or catch block," +
                    "\nand you return the same value in the finally block than it will override that value" +
                    "\nand finally block will be returned.");
            System.out.println("This will be executed every time" +
                    "\nThis can be used to release the resources" +
                    "\nFor example scanner.close();");
            System.out.println("This block will not execute when there is " +
                    "\nSystem.exit(); " +
                    "\nis called in the try block.");
        }
    }
}
