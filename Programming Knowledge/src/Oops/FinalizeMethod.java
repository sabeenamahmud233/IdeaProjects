package Oops;

public class FinalizeMethod {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("This is finalize method.");
    }
}
