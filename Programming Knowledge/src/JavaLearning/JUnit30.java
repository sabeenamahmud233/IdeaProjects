package JavaLearning;

public class JUnit30 {
    public static void main(String[] args) {
        JUnitClass unitClass = new JUnitClass();
        unitClass.addition();
    }
}

class JUnitClass {
    private static int a, b;

    public int addition() {
        a = 5;
        b = 10;
        return a + b;
    }
}
