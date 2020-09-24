package JavaLearning;

public class MethodOverloading12 {
    public static void main(String[] args) {
        OverloadingExplain overLoad = new OverloadingExplain();
        overLoad.addition(5, 6);
        overLoad.addition(5.6, 6.9);

    }
}

class OverloadingExplain {
    public void addition(int a, int b) {
        System.out.println("Integer Numbers Addition is: " + (a + b));
    }

    public void addition(double a, double b) {
        System.out.println("Double Numbers Addition is: " + (a + b));
    }
}
